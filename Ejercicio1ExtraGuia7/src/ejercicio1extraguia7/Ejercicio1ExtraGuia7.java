/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1extraguia7;

import Entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio1ExtraGuia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cancion c1 = new Cancion();
        System.out.println("Ingrese el Titulo");
        c1.setTitulo(leer.next());
        System.out.println("Ingrese el autor");
        c1.setAutor(leer.next());
        System.out.println("El Titulo es: " + c1.getTitulo());
        System.out.println("El autor es: " + c1.getAutor());
    }

}
