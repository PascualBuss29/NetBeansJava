/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class LibroServicio {
    
    public Libro altaLibro(){
        
        Libro L1 = new Libro();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese ISBN");
        L1.setISBN(leer.nextInt());
        System.out.println("Ingrese el titulo");
        L1.setTitulo(leer.next());
        System.out.println("Ingrese el autor");
        L1.setAutor(leer.next());
        System.out.println("Ingrese el numero de pagina");
        L1.setNumeroPagina(leer.nextInt());
        return L1;
    }
    public void mostrarLibro(Libro L1){
        System.out.println("El ISBN es: " + L1.getISBN()+ " El titulo es: " + L1.getTitulo()+ " El autor es: " + L1.getAutor()+ " El numero de pagina es: "+ L1.getNumeroPagina());
    }
}
