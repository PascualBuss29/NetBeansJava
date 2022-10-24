/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class PuntosServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   Puntos p2 = new Puntos();
    
    public Puntos crearPuntos (){
        
        System.out.println("Ingrese x1");
        p2.setX1(leer.nextInt());
        System.out.println("Ingrese y1");
        p2.setY1(leer.nextInt());
        System.out.println("Ingrese x2");
        p2.setX2(leer.nextInt());
        System.out.println("Ingrese y2");
        p2.setY2(leer.nextInt());
        return(p2);
    }
    int num;
    public void calcularyDevolver(){
        
         num =(int) Math.sqrt(Math.pow(p2.getX2()-p2.getX1(),2)+ Math.pow(p2.getY2()-p2.getY1(),2));
         System.out.println("La distancia es: "+num);
    }
}
