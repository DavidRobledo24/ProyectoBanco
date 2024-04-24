package utils;

import interfaces.gerente.BotonMenuGerenteSucursal;
import interfaces.gerente.MenuGerenteDetalleSucursal;
import interfaces.gerente.MenuGerenteDetalleSucursalEliminarVendedor;
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
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
    
    public int contarVendedores(String id){
        try{
            String peticion = "SELECT * FROM vendedor";
            int contador = 0;
            ResultSet vendedores = manipular.executeQuery(peticion);
            vendedores.next();
            if(vendedores.getRow() == 1){
                do{
                    if(vendedores.getString("idSucursal").equals(id)) contador++;
                }while(vendedores.next());
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
    
    public void actualizarTablaVendedores(DefaultTableModel modelo, String id, Image iconoEditar, Image iconoEliminar, MenuGerenteGeneral ventanaAnterior, MenuGerenteDetalleSucursal ventanaActual){
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
                        
                        botonEliminar.addActionListener(new ActionListener(){
                            @Override
                            public void actionPerformed(ActionEvent e){
                                ventanaAnterior.setEnabled(false);
                                new MenuGerenteDetalleSucursalEliminarVendedor(baseTemp, documentoActual, ventanaAnterior, ventanaActual, id);
                            }
                        });
                        
                        modelo.addRow(new Object[]{contador, vendedores.getString("documento"), vendedores.getString("nombre"), vendedores.getString("telefono"), vendedores.getString("codigoAcceso"), botonEditar, botonEliminar});
                        contador++;
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
            if(buscarVendedorExistente(documento)){
                JOptionPane.showMessageDialog(null, "No se aceptan documentos repetidos", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
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
    
    public boolean buscarVendedorExistente(String documento){
        boolean encontrado = false;
        try{
            String peticion = "SELECT * FROM vendedor";
            ResultSet vendedores = manipular.executeQuery(peticion);
            vendedores.next();
            if(vendedores.getRow() == 1){
                do{
                    if(vendedores.getString("documento").equals(documento)){
                        encontrado = true;
                        break;
                    }
                }while(vendedores.next());
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
        return encontrado;
    }
    
    public boolean editarVendedor(String documento, String nombre, String telefono, String codigoAcceso){
        boolean respuesta = false;
        try{
            String peticion = "UPDATE vendedor SET nombre='"+nombre+"', telefono='"+telefono+"', codigoAcceso='"+codigoAcceso+"' WHERE documento='"+documento+"'";
            int actu = manipular.executeUpdate(peticion);
            respuesta = actu == 1;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
        return respuesta;
    }
    
    public void eliminarVendedor(String documento){
        try{
            String peticion = "DELETE FROM vendedor WHERE documento='"+documento+"'";
            int respuesta = manipular.executeUpdate(peticion);
            if(respuesta == 1) JOptionPane.showMessageDialog(null, "Vendedor eliminado con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
            else JOptionPane.showMessageDialog(null, "Error desconocido", "Error", JOptionPane.ERROR_MESSAGE);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
    }
    
    public boolean editarSucursal(String id, String nombre, String direccion, String telefono){
        boolean respuesta = false;
        try{
            String peticion = "UPDATE sucursal SET nombre='"+nombre+"', direccion='"+direccion+"', telefono='"+telefono+"' WHERE idSucursal='"+id+"'";
            int actu = manipular.executeUpdate(peticion);
            respuesta = actu == 1;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
        return respuesta;
    }
    
    public void eliminarSucursal(String id){
        try{
            String peticion = "DELETE FROM sucursal WHERE idSucursal='"+id+"'";
            int respuesta = manipular.executeUpdate(peticion);
            if(respuesta == 1) JOptionPane.showMessageDialog(null, "Sucursal eliminada con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
            else JOptionPane.showMessageDialog(null, "Error desconocido", "Error", JOptionPane.ERROR_MESSAGE);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
    }
    
    public boolean eliminarVendedoresEnMasa(String id){
        boolean respuesta = false;
        
        int contador = 0;
        try{
            String peticion = "SELECT * FROM vendedor";
            ResultSet vendedores = manipular.executeQuery(peticion);
            vendedores.next();
            if(vendedores.getRow() == 1){
                do{
                    if(vendedores.getString("idSucursal").equals(id)) contador++;
                }while(vendedores.next());
                respuesta = true;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
        
        String[] ids = new String[contador];
        contador = 0;
        try{
            String peticion = "SELECT * FROM vendedor";
            ResultSet vendedores = manipular.executeQuery(peticion);
            vendedores.next();
            if(vendedores.getRow() == 1){
                do{
                    if(vendedores.getString("idSucursal").equals(id)){
                        ids[contador] = vendedores.getString("documento");
                        contador++;
                    }
                }while(vendedores.next());
                respuesta = true;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
        for(String x : ids){
            System.out.println(x);
        }
        try{
            for(int i = 0; i < ids.length; i++){
                manipular.executeUpdate("DELETE FROM vendedor WHERE documento='"+ids[i]+"'");
            }
            respuesta = true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
        return respuesta;
    }
    
    public void llenarEstadisticas(Map sucursales){
        try {
            String peticion = "SELECT nombre, balance FROM sucursal";
            ResultSet rs = manipular.executeQuery(peticion);
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                double balance = rs.getDouble("balance");
                sucursales.put(nombre, balance);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
    }
    
    public boolean agregarSucursal(String nombre, String direccion, String telefono, String documentoGerente){
        boolean respuesta = false;
        try{
            int idSucursal = conseguirIdSucursal();
            String peticion = "INSERT INTO sucursal VALUES ('"+idSucursal+"', '"+nombre+"', '"+direccion+"', '"+telefono+"', '', '1000000', '"+documentoGerente+"')";
            int actu = manipular.executeUpdate(peticion);
            respuesta = actu == 1;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
        return respuesta;
    }
    
    
    
    private int conseguirIdSucursal(){
        int contador = 1;
        try{
            String peticion = "SELECT * FROM sucursal";
            ResultSet sucursales = manipular.executeQuery(peticion);
            sucursales.next();
            if(sucursales.getRow() == 1){
                do{
                    if(!sucursales.getString("idSucursal").equals(contador+"")) return contador;
                    contador++;
                }while(sucursales.next());
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
        return contador;
    }
}
