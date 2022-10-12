/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1guia7;

import Entidad.Libro;
import Servicio.LibroServicio;

/**
 *
 * @author USUARIO
 */
public class Ejercicio1Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LibroServicio Ls = new LibroServicio();
       Libro L1 = Ls.altaLibro();
       Ls.mostrarLibro(L1);
    }
    
}
