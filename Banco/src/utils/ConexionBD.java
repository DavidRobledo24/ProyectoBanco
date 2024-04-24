package utils;

import interfaces.gerente.BotonMenuGerenteSucursal;
import interfaces.gerente.MenuGerenteDetalleSucursal;
import interfaces.gerente.MenuGerenteEditarVendedor;
import interfaces.gerente.MenuGerenteGeneral;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConexionBD {
    Connection conexion;
    public Statement manipular;
    
    public ConexionBD(){
        String hostname = "localhost";
	String puerto = "3306";
	String databasename = "banco";
	String user = "root";
	String password = "";
        
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+databasename;
        
        try {
	    conexion = DriverManager.getConnection(url, user, password);
	    manipular = conexion.createStatement();
	    System.out.println("Conexion exitosa a: "+databasename);
	} catch (SQLException e) {
	    JOptionPane.showMessageDialog(null, "Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);
	}
    }
    
    public boolean encontrarLogin(String usuario, String documento, String codigoDeAcceso){
        try{
            String peticion = "SELECT * FROM "+usuario;
            ResultSet usuarios = manipular.executeQuery(peticion);
            usuarios.next();
            if(usuarios.getRow() == 1){
                do{
                    if(usuarios.getString("documento").equals(documento)){
                        if(usuarios.getString("codigoAcceso").equals(codigoDeAcceso)) return true;
                        else {
                            JOptionPane.showMessageDialog(null, "Codigo de acceso incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
                            return false;
                        }
                    }
                }while(usuarios.next());
                JOptionPane.showMessageDialog(null, "No se ha encontrado el documento", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            else{
                JOptionPane.showMessageDialog(null, "No hay usuarios de tipo "+usuario+" registrados", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public int contarSucursales(String documentoGerente){
        try{
            String peticion = "SELECT * FROM sucursal";
            int contador = 0;
            ResultSet sucursales = manipular.executeQuery(peticion);
            sucursales.next();
            if(sucursales.getRow() == 1){
                do{
                    if(sucursales.getString("gerenteDocumento").equals(documentoGerente)) contador++;
                }while(sucursales.next());
                return contador;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return 0;
    }
    
    public BotonMenuGerenteSucursal[] darSucursales(int cantidad, String documentoGerente, MenuGerenteGeneral ventanaActual){
        BotonMenuGerenteSucursal[] vectorSucursales = new BotonMenuGerenteSucursal[cantidad];
        try{
            int contador = 0;
            String peticion = "SELECT * FROM sucursal";
            ResultSet sucursales = manipular.executeQuery(peticion);
            sucursales.next();
            if(sucursales.getRow() == 1){
                do{
                    if(sucursales.getString("gerenteDocumento").equals(documentoGerente)){
                        vectorSucursales[contador] = new BotonMenuGerenteSucursal(sucursales.getString("nombre"), sucursales.getString("direccion"), sucursales.getString("telefono"), sucursales.getString("idSucursal"), ventanaActual);
                        contador++;
                    }
                }while(sucursales.next());
                return vectorSucursales;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return vectorSucursales;
    }
    
    public String darDatoSucursal(String id, String dato){
        try{
            String peticion = "SELECT * FROM sucursal";
            ResultSet sucursales = manipular.executeQuery(peticion);
            sucursales.next();
            if(sucursales.getRow() == 1){
                do{
                    if(sucursales.getString("idSucursal").equals(id)){
                        return sucursales.getString(dato);
                    }
                }while(sucursales.next());
                System.out.println("No se ha encontrado la sucursal");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return "";
    }
    
    public String darDatoVendedor(String documento, String dato){
        try{
            String peticion = "SELECT * FROM vendedor";
            ResultSet vendedores = manipular.executeQuery(peticion);
            vendedores.next();
            if(vendedores.getRow() == 1){
                do{
                    if(vendedores.getString("documento").equals(documento)){
                        return vendedores.getString(dato);
                    }
                }while(vendedores.next());
                System.out.println("No se ha encontrado el vendedor");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return "";
    }
    
    public void actualizarTablaVendedores(DefaultTableModel modelo, String id, Image iconoEditar, Image iconoEliminar, JFrame ventanaAnterior, MenuGerenteDetalleSucursal ventanaActual){
        modelo.setRowCount(0);
        try{
            String peticion = "SELECT * FROM vendedor";
            ResultSet vendedores = manipular.executeQuery(peticion);
            int contador = 1;
            vendedores.next();
            if(vendedores.getRow() == 1){
                do{
                    System.out.println(vendedores.getString("idSucursal"));
                    System.out.println(id);
                    if(vendedores.getString("idSucursal").equals(id)){
                        JButton botonEditar = new JButton();
                        JButton botonEliminar = new JButton();
                        
                        botonEditar.setBackground(Color.white);
                        botonEliminar.setBackground(Color.white);
                        
                        botonEditar.setIcon(new ImageIcon(iconoEditar));
                        botonEliminar.setIcon(new ImageIcon(iconoEliminar));
                        
                        String documentoActual = vendedores.getString("documento");
                        ConexionBD baseTemp = this;
                        
                        botonEditar.addActionListener(new ActionListener(){
                            @Override
                            public void actionPerformed(ActionEvent e){
                                ventanaAnterior.setEnabled(false);
                                new MenuGerenteEditarVendedor(ventanaAnterior, documentoActual, baseTemp, ventanaActual);
                            }
                        });
                        
                        modelo.addRow(new Object[]{contador, vendedores.getString("documento"), vendedores.getString("nombre"), vendedores.getString("telefono"), vendedores.getString("codigoAcceso"), botonEditar, botonEliminar});
                    }
                }while(vendedores.next());
            }
            else{
                System.out.println("Tabla vacia");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean agregarVendedor(String documento, String nombre, String telefono, String codigoAcceso, String idSucursal){
        boolean respuesta = false;
        try{
            String peticion = "INSERT INTO vendedor VALUES('"+documento+"', '"+nombre+"', '"+telefono+"', '"+codigoAcceso+"', '"+idSucursal+"')";
            int actu = manipular.executeUpdate(peticion);
            respuesta = actu == 1;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
        if(respuesta) JOptionPane.showMessageDialog(null, "Vendedor agregado con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
        else JOptionPane.showMessageDialog(null, "Error de sistema", "Error", JOptionPane.ERROR_MESSAGE);        
        return respuesta;
    }
    public boolean editarVendedor(String documento, String nombre, String telefono, String codigoAcceso){
//        try{
//            
//        }catch(SQLException e){
//            JOptionPane.showMessageDialog(null, "Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
//        }
        return false;
    }
     public void imprimirUsuarios(JTable TablaClientes) {
        
        DefaultTableModel modelo = new DefaultTableModel(); 
        modelo.addColumn("N*");
        modelo.addColumn("Documento");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Direccion");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Correo");

        TablaClientes.setModel(modelo);

        try {
            String consulta = "SELECT * FROM clientes"; 
            ResultSet registros = manipular.executeQuery(consulta); 

            int contador = 1;
            while (registros.next()) {
                // Crear un arreglo de objetos para cada columna
                Object[] personas = {
                    contador,
                    registros.getString("documento"), // Obtener el valor de una variable
                    registros.getString("nombre"),
                    registros.getString("apellidos"),
                    registros.getString("direccion"),
                    registros.getString("telefono"),
                    registros.getString("email")
                };
                modelo.addRow(personas);

                contador++;
            }
        } catch (SQLException ex) {
            System.out.println("No es posible llenar la tabla: " + ex.getMessage());
        }
    }
    public void eliminarVendedor(){
        
    }
    public void editarSucursal(){
        
    }
    public void eliminarSucursal(){
        
    }
}
