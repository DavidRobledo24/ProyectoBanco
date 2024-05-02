package utils;
import interfaces.gerente.BotonMenuGerenteCreditos;
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
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Base64;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConexionBD {
    public Connection conexion;
    public Statement manipular;
    public boolean conexionExitosa;
    
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
            conexionExitosa = true;
	} catch (SQLException e) {
	    JOptionPane.showMessageDialog(null, "No se puede iniciar el programa sin la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            conexionExitosa = false;
	}
    }
    
    public boolean getConexionExitosa(){
        return conexionExitosa;
    }
    
    public boolean encontrarLogin(String usuario, String documento, String codigoDeAcceso){
        try{
            String peticion = "SELECT * FROM "+usuario;
            ResultSet usuarios = manipular.executeQuery(peticion);
            usuarios.next();
            if(usuarios.getRow() == 1){
                do{
                    if(usuarios.getString("documento").equals(documento)){
                        byte[] bytesCodigo = Base64.getDecoder().decode(usuarios.getString("codigoAcceso"));
                        String codigoDesencriptado = new String(bytesCodigo);
                        if(codigoDesencriptado.equals(codigoDeAcceso)) return true;
                        else{
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
            JOptionPane.showMessageDialog(null, "1Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public int contarSucursales(String documentoGerente){
        int contador = 0;
        try{
            String peticion = "SELECT * FROM sucursal";
            ResultSet sucursales = manipular.executeQuery(peticion);
            sucursales.next();
            if(sucursales.getRow() == 1){
                do{
                    if(sucursales.getString("gerenteDocumento").equals(documentoGerente)) contador++;
                }while(sucursales.next());
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "2Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return contador;
    }
    
    public String[] contarCreditos(String documentoGerente){
        String[] vectorCreditos;
        try{
            int contadorSucursales = 0;
            String peticion = "SELECT * FROM sucursal WHERE gerenteDocumento="+documentoGerente;
            ResultSet resultados = manipular.executeQuery(peticion);
            resultados.next();
            if(resultados.getRow() == 1){
                do{
                    contadorSucursales++;
                }while(resultados.next());
            }
            else return new String[0];
            resultados.close();
            
            String[] idSucursales = new String[contadorSucursales];
            contadorSucursales = 0;
            resultados = manipular.executeQuery(peticion);
            resultados.next();
            do{
                idSucursales[contadorSucursales] = resultados.getString("idSucursal");
                contadorSucursales++;
            }while(resultados.next());
            resultados.close();
            
            int contadorClientes = 0;
            for(int i = 0; i < idSucursales.length; i++){    
                peticion = "SELECT * FROM cliente WHERE idSucursales="+idSucursales[i];
                resultados = manipular.executeQuery(peticion);
                resultados.next();
                if(resultados.getRow() == 1){
                    do{
                        contadorClientes++;
                    }while(resultados.next());
                }
                resultados.close();
            }
            
            String[] cuentasBancariasTemp = new String[contadorClientes];
            contadorClientes = 0;
            for(int i = 0; i < idSucursales.length; i++){
                peticion = "SELECT * FROM cliente WHERE idSucursales="+idSucursales[i];
                resultados = manipular.executeQuery(peticion);
                resultados.next();
                if(resultados.getRow() == 1){
                    do{
                        cuentasBancariasTemp[contadorClientes] = resultados.getString("idCuentaBancaria");
                        contadorClientes++;
                    }while(resultados.next());
                }
                resultados.close();
            }
            
            contadorClientes = 0;
            for(int i = 0; i < cuentasBancariasTemp.length; i++){
                peticion = "SELECT * FROM credito WHERE idCuentaBancaria="+cuentasBancariasTemp[i];
                resultados = manipular.executeQuery(peticion);
                resultados.next();
                if(resultados.getRow() == 1) contadorClientes++;
                resultados.close();
            }
            
            vectorCreditos = new String[contadorClientes];
            for(int i = 0; i < vectorCreditos.length; i++){
                peticion = "SELECT * FROM credito WHERE idCuentaBancaria="+cuentasBancariasTemp[i];
                resultados = manipular.executeQuery(peticion);
                resultados.next();
                if(resultados.getRow() == 1) vectorCreditos[i] = resultados.getString("idCredito");
                resultados.close();
            }
            return vectorCreditos;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "3Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return new String[0];
    }
    
    private boolean coincideGerente(String documentoGerente, String idCuentaBancaria){
        boolean respuesta = false;
        try{
            String peticion = "SELECT * FROM cliente WHERE idCuentaBancaria="+idCuentaBancaria;
            ResultSet resultadoCliente = manipular.executeQuery(peticion);
            resultadoCliente.next();
            if(resultadoCliente.getRow() == 1){
                if(sucursalEsDeGerente(documentoGerente, resultadoCliente.getString("idSucursales"))){
                    respuesta = true;
                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "4Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return respuesta;
    }
    
    private boolean sucursalEsDeGerente(String documentoGerente, String id){
        boolean respuesta = false;
        try{
            String peticion = "SELECT * FROM sucursal WHERE idSucursal="+id;
            ResultSet resultadoSucursal = manipular.executeQuery(peticion);
            resultadoSucursal.next();
            if(resultadoSucursal.getRow() == 1){
                if(resultadoSucursal.getString("gerenteDocumento").equals(documentoGerente)){
                    respuesta = true;
                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "5Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return respuesta;
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
            JOptionPane.showMessageDialog(null, "6Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "7Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return vectorSucursales;
    }
    
    public BotonMenuGerenteCreditos[] darCreditos(String documentoGerente, MenuGerenteGeneral ventanaAnterior){
        String[] vectorIds = contarCreditos(documentoGerente);
        BotonMenuGerenteCreditos[] vectorCreditos = new BotonMenuGerenteCreditos[vectorIds.length];
        for(int i = 0; i < vectorIds.length; i++){
            vectorCreditos[i] = new BotonMenuGerenteCreditos(this, vectorIds[i], ventanaAnterior);
        }
        
        return vectorCreditos;
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
            JOptionPane.showMessageDialog(null, "9Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);
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
                        if(dato.equals("codigoAcceso")){
                            byte[] bytesCodigo = Base64.getDecoder().decode(vendedores.getString("codigoAcceso"));
                            String codigoDesencriptado = new String(bytesCodigo);
                            return codigoDesencriptado;
                        }
                        else return vendedores.getString(dato);
                    }
                }while(vendedores.next());
                System.out.println("No se ha encontrado el vendedor");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "10Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return "";
    }
    
    public String darDatoCredito(String idCredito, String dato){
        String resultado = "";
        try{
            String peticion = "SELECT * FROM credito WHERE idCredito="+idCredito;
            ResultSet resultadoCredito = manipular.executeQuery(peticion);
            resultadoCredito.next();
            if(resultadoCredito.getRow() == 1){
                resultado = resultadoCredito.getString(dato);
            }
            else JOptionPane.showMessageDialog(null, "Error desconocido", "Error", JOptionPane.ERROR_MESSAGE);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "11Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }
    
    public String darDatoCliente(String documentoCliente, String dato){
        String resultado = "";
        try{
            String peticion = "SELECT * FROM cliente WHERE documento="+documentoCliente;
            ResultSet resultadoCliente = manipular.executeQuery(peticion);
            resultadoCliente.next();
            if(resultadoCliente.getRow() == 1){
                resultado = resultadoCliente.getString(dato);
            }
            else JOptionPane.showMessageDialog(null, "Error desconocido", "Error", JOptionPane.ERROR_MESSAGE);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "12Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }
    
    public String darDatoCuentaBancaria(String idCuentaBancaria, String dato){
        String resultado = "";
        try{
            String peticion = "SELECT * FROM cuentabancaria WHERE idCuentaBancaria="+idCuentaBancaria;
            ResultSet resultadoCuentaBancaria = manipular.executeQuery(peticion);
            resultadoCuentaBancaria.next();
            if(resultadoCuentaBancaria.getRow() == 1){
                resultado = resultadoCuentaBancaria.getString(dato);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "13Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }
    
    public String encontrarDocumentoCliente(String idCuentaBancaria){
        String resultado = "";
        try{
            String peticion = "SELECT * FROM cliente WHERE idCuentaBancaria="+idCuentaBancaria;
            ResultSet resultadoCliente = manipular.executeQuery(peticion);
            resultadoCliente.next();
            if(resultadoCliente.getRow() == 1){
                resultado = resultadoCliente.getString("documento");
            }
            else JOptionPane.showMessageDialog(null, "Error desconocido", "Error", JOptionPane.ERROR_MESSAGE);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "14Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
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
                        
                        byte[] bytesCodigo = Base64.getDecoder().decode(vendedores.getString("codigoAcceso"));
                        String codigoDesencriptado = new String(bytesCodigo);
                        
                        modelo.addRow(new Object[]{contador, vendedores.getString("documento"), vendedores.getString("nombre"), vendedores.getString("telefono"), codigoDesencriptado, botonEditar, botonEliminar});
                        contador++;
                    }
                }while(vendedores.next());
            }
            else{
                System.out.println("Tabla vacia");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "15Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean agregarVendedor(String documento, String nombre, String telefono, String codigoAcceso, String idSucursal){
        boolean respuesta = false;
        try{
            if(buscarVendedorExistente(documento)){
                JOptionPane.showMessageDialog(null, "No se aceptan documentos repetidos", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            String codigoEncriptado = Base64.getEncoder().encodeToString(codigoAcceso.getBytes());
            String peticion = "INSERT INTO vendedor VALUES('"+documento+"', '"+nombre+"', '"+telefono+"', '"+codigoEncriptado+"', '"+idSucursal+"')";
            int actu = manipular.executeUpdate(peticion);
            respuesta = actu == 1;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "16Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
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
            JOptionPane.showMessageDialog(null, "17Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
        return encontrado;
    }
    
    public boolean editarVendedor(String documento, String nombre, String telefono, String codigoAcceso){
        boolean respuesta = false;
        try{
            String codigoEncriptado = Base64.getEncoder().encodeToString(codigoAcceso.getBytes());
            String peticion = "UPDATE vendedor SET nombre='"+nombre+"', telefono='"+telefono+"', codigoAcceso='"+codigoEncriptado+"' WHERE documento='"+documento+"'";
            int actu = manipular.executeUpdate(peticion);
            respuesta = actu == 1;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "18Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
        return respuesta;
        
    }  
    public void crearCliente(String documento,String nombre,String telefono,String email,String clave ){
        boolean respuesta = false;
        try {

            String consulta = "INSERT INTO cliente (documento,nombre,telefono, email,clave) VALUES ('"+documento+"','"+nombre+"','"+telefono+"','"+email+"','"+clave+"',')";
            int resp_consulta = manipular.executeUpdate(consulta);
            
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Insert: " + ex.getMessage());
        }
        if (respuesta){
            System.out.println("Insertado con exito");
            
        }else{
            System.out.println("No se pudo insertar");
        }
    }
    
    
    public boolean editarCliente(String cedulaAEditar, String nombreNuevo, String telefonoNuevo, String correoNuevo, String claveNueva) {
        boolean editado = false;

        try {
            String peticion = "UPDATE cliente SET nombre='" + nombreNuevo + "', telefono='" + telefonoNuevo + "', email='" + correoNuevo + "' WHERE documento='" + cedulaAEditar + "'";
            int actu = manipular.executeUpdate(peticion);
            editado = actu == 1;
            JOptionPane.showMessageDialog(null, "Editado con exito: ", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en base de datos: " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }

        return editado;
}

    
    
    
    public void imprimirUsuarios(JTable TablaClientes) {
        
        DefaultTableModel modelo = new DefaultTableModel(); 
        modelo.addColumn("N*");
        modelo.addColumn("documento");
        modelo.addColumn("nombre");
        modelo.addColumn("telefono");
        modelo.addColumn("email");
        modelo.addColumn("idCuentaBancaria");

        TablaClientes.setModel(modelo);

        try {
            String consulta = "SELECT * FROM cliente"; 
            ResultSet registros = manipular.executeQuery(consulta); 

            int contador = 1;
            while (registros.next()) {
                // Crear un arreglo de objetos para cada columna
                Object[] clientes = {
                    contador,
                    registros.getString("documento"), // Obtener el valor de una variable
                    registros.getString("nombre"),
                    registros.getString("telefono"),
                    registros.getString("email"),
                    registros.getString("idCuentaBancaria")
                };
                modelo.addRow(clientes);

                contador++;
            }
        } catch (SQLException ex) {
            System.out.println("No es posible llenar la tabla: " + ex.getMessage());
        }
        
    }   
    public void compararClave(String clave,String cuenta){
        String consulta = "SELECT idCuentaBancaria FROM cliente";
        String c = consulta;
       
        if(clave==c){
            String peticion = "DELETE FROM cliente WHERE idCuentaBancaria='" + cuenta+ "'";

            try {
                Statement stmt = conexion.createStatement();
                int filasEliminadas = stmt.executeUpdate(consulta);

                if (filasEliminadas > 0) {
                    System.out.println("La persona ha sido eliminada correctamente");
                } else {
                    System.out.println("No se pudo encontrar una persona con la cedula proporcionada");
                }
            } catch (SQLException e) {
                System.out.println("Error al eliminar persona: " + e.getMessage());    }
        } else {
            System.out.println("Por favor, ingrese la cedula de la persona que desea eliminar");
        } 
    }
        
    public void eliminarVendedor(String documento){
        try{
            String peticion = "DELETE FROM vendedor WHERE documento='"+documento+"'";
            int respuesta = manipular.executeUpdate(peticion);
            if(respuesta == 1) JOptionPane.showMessageDialog(null, "Vendedor eliminado con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
            else JOptionPane.showMessageDialog(null, "Error desconocido", "Error", JOptionPane.ERROR_MESSAGE);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "19Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
    }
    
    public boolean editarSucursal(String id, String nombre, String direccion, String telefono){
        boolean respuesta = false;
        try{
            String peticion = "UPDATE sucursal SET nombre='"+nombre+"', direccion='"+direccion+"', telefono='"+telefono+"' WHERE idSucursal='"+id+"'";
            int actu = manipular.executeUpdate(peticion);
            respuesta = actu == 1;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "20Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
        return respuesta;
    }
    
    public void editarDeudaCuentaBancaria(String idCuentaBancaria, String dato){
        try{
            String deudaString = darDatoCuentaBancaria(idCuentaBancaria, "deuda");
            int deuda = Integer.parseInt(deudaString);
            int prestamo = Integer.parseInt(dato);
            deuda+=prestamo;
            String peticion  = "UPDATE cuentabancaria SET deuda='"+deuda+"' WHERE idCuentaBancaria="+idCuentaBancaria;
            manipular.executeUpdate(peticion);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "20Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
    }
    
    public void editarBalanceCuentaBancaria(String idCuentaBancaria, String dato){
        try{
            String balanceString = darDatoCuentaBancaria(idCuentaBancaria, "balance");
            int balance = Integer.parseInt(balanceString);
            int prestamo = Integer.parseInt(dato);
            balance+=prestamo;
            String peticion = "UPDATE cuentabancaria SET balance='"+balance+"' WHERE idCuentaBancaria="+idCuentaBancaria;
            manipular.executeUpdate(peticion);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "20Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
    }
    
    public boolean retirarDineroCuentaBancaria(String idCuentaBancaria, String dineroRetirar, String clave){
        boolean respuesta = false;
        try{
            if(!(clave.equals(darDatoCuentaBancaria(idCuentaBancaria, "clave")))){
                JOptionPane.showMessageDialog(null, "Clave incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            String balanceString = darDatoCuentaBancaria(idCuentaBancaria, "balance");
            int balance = Integer.parseInt(balanceString);
            int dineroRetirarInt = Integer.parseInt(dineroRetirar);
            balance-=dineroRetirarInt;
            if(balance >= 0){
                String peticion = "UPDATE cuentabancaria SET balance='"+balance+"' WHERE idCuentaBancaria="+idCuentaBancaria;
                int res = manipular.executeUpdate(peticion);
                if(res == 1) respuesta = true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Transferencia invalida", "Error", JOptionPane.ERROR_MESSAGE);
                respuesta = false;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "20Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
        return respuesta;
    }
    
    public void eliminarSucursal(String id){
        try{
            String peticion = "DELETE FROM sucursal WHERE idSucursal="+id;
            int respuesta = manipular.executeUpdate(peticion);
            if(respuesta == 1) JOptionPane.showMessageDialog(null, "Sucursal eliminada con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
            else JOptionPane.showMessageDialog(null, "Error desconocido", "Error", JOptionPane.ERROR_MESSAGE);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "21Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
    }
    
    public void eliminarCredito(String idCredito){
        try{
            String peticion = "DELETE FROM credito WHERE idCredito="+idCredito;
            manipular.executeUpdate(peticion);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "21Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
    }
    
    public void eliminarVendedoresEnMasa(String id){
        try{
            String peticion = "DELETE FROM vendedor WHERE idSucursal="+id;
            manipular.executeUpdate(peticion);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "22Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
    }
    
    public void eliminarClientesEnMasa(String id){
        try{
            int contador = 0;
            String peticion = "SELECT * FROM cliente WHERE idSucursales="+id;
            ResultSet resultados = manipular.executeQuery(peticion);
            resultados.next();
            if(resultados.getRow() == 1){
                do{
                    contador++;
                }while(resultados.next());
            }
            else return;
            
            resultados.close();
            
            String[] cuentasBancarias = new String[contador];
            contador = 0;
            resultados = manipular.executeQuery(peticion);
            resultados.next();
            do{
                cuentasBancarias[contador] = resultados.getString("idCuentaBancaria");
                contador++;
            }while(resultados.next());
            resultados.close();
            
            peticion = "DELETE FROM cliente WHERE idSucursales="+id;
            manipular.executeUpdate(peticion);
            
            for(String x : cuentasBancarias){
                peticion = "DELETE FROM credito WHERE idCuentaBancaria="+x;
                manipular.executeUpdate(peticion);
                peticion = "DELETE FROM cuentabancaria WHERE idCuentaBancaria="+x;
                manipular.executeUpdate(peticion);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "23Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
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
            JOptionPane.showMessageDialog(null, "25Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
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
            JOptionPane.showMessageDialog(null, "26Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
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
            JOptionPane.showMessageDialog(null, "27Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
        return contador;
    }


    
    public void actualizarHistorial(String id, String tabla, String actualizacion){
        String historialOriginal = "";
       try{
           String peticion = "SELECT * FROM "+tabla+" WHERE "+(tabla.equals("sucursal") ? "idSucursal" : "idCuentaBancaria")+"="+id;
           ResultSet resultados = manipular.executeQuery(peticion);
           resultados.next();
           if(resultados.getRow() == 1){
               historialOriginal = resultados.getString("historial");
           }
           else{
               System.out.println("Error desconocido");
               return;
           }
       }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "27Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
       }
       LocalDate fecha = LocalDate.now();
       LocalTime hora = LocalTime.now();
       actualizacion = fecha+" "+hora.getHour()+":"+hora.getMinute()+":"+(hora.getSecond() < 10 ? "0"+hora.getSecond() : hora.getSecond())+"_"+actualizacion;
       if(historialOriginal.equals("")){
           historialOriginal+=actualizacion;
       }
       else{
           String[] historialPartido = historialOriginal.split("\\|");
           if(historialPartido.length < 5){
               historialOriginal+="|"+actualizacion;
           }
           else{
               historialPartido[0] = historialPartido[1];
               historialPartido[1] = historialPartido[2];
               historialPartido[2] = historialPartido[3];
               historialPartido[3] = historialPartido[4];
               historialPartido[4] = actualizacion;
               for(int i = 0; i < historialPartido.length; i++){
                   if(i == 0){
                       historialOriginal = historialPartido[i];
                   }
                   else{
                       historialOriginal+="|"+historialPartido[i];
                   }
               }
           }
       }
       try{
           String peticion = "UPDATE "+tabla+" SET historial='"+historialOriginal+"' WHERE "+(tabla.equals("sucursal") ? "idSucursal" : "idCuentaBancaria")+"="+id;
           manipular.executeUpdate(peticion);
       }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "27Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
       }
    }
    
    public void llenarTablaHistorial(DefaultTableModel modelo, String id, String tabla){
       String historialOriginal = "";
       modelo.setRowCount(0);
       try{
           String peticion = "SELECT * FROM "+tabla+" WHERE "+(tabla.equals("sucursal") ? "idSucursal" : "idCuentaBancaria")+"="+id;
           ResultSet resultados = manipular.executeQuery(peticion);
           resultados.next();
           if(resultados.getRow() == 1){
               historialOriginal = resultados.getString("historial");
           }
           else{
               System.out.println("Error desconocido");
               return;
           }
       }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "27Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
       }
       if(!(historialOriginal.equals(""))){
           String[] historialPartido = historialOriginal.split("\\|");
           System.out.println(historialPartido.length);
           for(int i = 0; i < historialPartido.length; i++){
               String[] partePartida = historialPartido[i].split("_");
               Object[] objetos = new Object[partePartida.length];
               for(int j = 0; j < partePartida.length; j++){
                   objetos[j] = partePartida[j];
               }
               modelo.addRow(objetos);
           }
       }
    }
    
    public boolean agregarCredito(String valor, String idCuentaBancaria){
        int id = conseguirIdCredito();
        boolean creacion = false;
        boolean revisarCredito = buscarCreditoExistente(idCuentaBancaria);
        
        if(revisarCredito == false){
            try{
                String peticion = "INSERT INTO credito VALUES('"+id+"', '"+valor+"', '"+idCuentaBancaria+"')";
                int respuesta = manipular.executeUpdate(peticion);
                if(respuesta == 1){
                    creacion = true;
                    JOptionPane.showMessageDialog(null, "Se agrego el Credito con exito ", "Exito", JOptionPane.INFORMATION_MESSAGE);
                    
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "27Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
            } 
        }else{
           JOptionPane.showMessageDialog(null, "Ya existe un credito pendiente en esta cuenta: ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return creacion;
    }
    
    public int conseguirIdCredito(){
        int contador = 1;
        try{
            String peticion = "SELECT * FROM credito";
            ResultSet resultados = manipular.executeQuery(peticion);
            resultados.next();
            if(resultados.getRow() == 1){
                do{
                    if(!(resultados.getString("idCredito").equals(contador+""))) return contador;
                    contador++;
                }while(resultados.next());
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "27Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
        return contador;
    }
    
    public boolean ingresarDinero(String idCuentaBancaria,String dinero){
        boolean respuesta = false;
        try{
            String dineroAnterior = darDatoCuentaBancaria(idCuentaBancaria, "balance");
            String deudaString = darDatoCuentaBancaria(idCuentaBancaria, "deuda");
            int deuda = Integer.parseInt(deudaString);
            int dineroAnteriorInt = Integer.parseInt(dineroAnterior);
            int dineroAIngresar = Integer.parseInt(dinero);
            System.out.println(dineroAIngresar);
            System.out.println(deuda);
            if(deuda > 0){
                deuda-=dineroAIngresar;
                if(deuda < 0){
                    dineroAIngresar = deuda * -1;
                    deuda = 0;
                }
                else{
                    dineroAIngresar = 0;
                }
            }
            System.out.println(dineroAIngresar);
            int dineroActual = dineroAnteriorInt+dineroAIngresar;
            
            String peticion = "UPDATE cuentabancaria SET balance='"+dineroActual+"', deuda='"+deuda+"' WHERE idCuentaBancaria="+idCuentaBancaria;
            int resp = manipular.executeUpdate(peticion);
            if(resp == 1) respuesta = true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "27Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
        return respuesta;
    }
    public boolean buscarCreditoExistente(String idCuentaBancaria){
        boolean encontrado = false;
        try{
            String peticion = "SELECT * FROM credito WHERE idCuentaBancaria="+idCuentaBancaria;
            ResultSet rs = manipular.executeQuery(peticion);
            rs.next();
            if(rs.getRow() == 1){
                do{
                    if(rs.getString("idCuentaBancaria").equals(idCuentaBancaria)){
                        encontrado = true;
                        break;
                    }
                }while(rs.next());
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "17Error en base de datos: "+e, "Error", JOptionPane.ERROR_MESSAGE);        
        }
        return encontrado;
    }
}
