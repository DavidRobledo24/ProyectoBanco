package main;

<<<<<<< HEAD
import interfaces.CRUD;
=======
import interfaces.InicioSesion;
import interfaces.gerente.MenuGerenteGeneral;
>>>>>>> d4acab4085a59701679417322ce8c19b8242d5d8
import utils.ConexionBD;

public class Banco {
    
    public static void main(String[] args) {
        ConexionBD basedatos = new ConexionBD();
<<<<<<< HEAD
        CRUD ventana = new CRUD();
=======
        new InicioSesion(basedatos);
//        MenuGerenteGeneral ventana = new MenuGerenteGeneral();
>>>>>>> d4acab4085a59701679417322ce8c19b8242d5d8
    }
    
}
