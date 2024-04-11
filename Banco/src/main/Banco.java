package main;

import interfaces.CRUD;
import utils.ConexionBD;

public class Banco {
    
    public static void main(String[] args) {
        ConexionBD basedatos = new ConexionBD();
        CRUD ventana = new CRUD();
    }
    
}
