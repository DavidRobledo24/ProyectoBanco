package utils;

import interfaces.gerente.BotonMenuGerenteSucursal;
import interfaces.gerente.MenuGerenteGeneral;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
    
    public void crearCliente(String documentoN,String nombreN,String telefonoN,String emailN, String claveN){
 
        String documento = documentoN;
        String nombre = nombreN;
        String telefono = telefonoN;
        String email = emailN;
        String clave = claveN;
        
        try{
            String consulta = "INSERT INTO cliente (documento,nombre,telefono,email,clave) VALUES ('"+documento+"','"+nombre+"','"+telefono+"','"+email+"', '"+clave+"')";
            int resp_consulta = manipular.executeUpdate(consulta); 
 
            if (resp_consulta == 1) { 
                System.out.println("Insertado con exito");
                //JOptionPane.showMessageDialog(this, "Insertado con exito");
            } else {
                System.out.println("No se pudo insertar");
                //JOptionPane.showMessageDialog(this, "No se pudo insertar");
            }
        }catch(SQLException ex){
            System.out.println("Error al insertar"+ex.getMessage());
            //JOptionPane.showMessageDialog(this, "Error al insertar: " + ex.getMessage());
        }
    }
}
