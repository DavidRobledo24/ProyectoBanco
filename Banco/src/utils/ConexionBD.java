package utils;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

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
	    System.out.println("Error al conectar con la db: " + e.getMessage());
	}
    }
}
