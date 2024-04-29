package main;

import interfaces.InicioSesion;
import utils.ConexionBD;

public class Banco {
    
    public static void main(String[] args) {
        ConexionBD basedatos = new ConexionBD();
        new InicioSesion(basedatos);
    }
    
}
