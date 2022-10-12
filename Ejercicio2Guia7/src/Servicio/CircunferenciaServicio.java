/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class CircunferenciaServicio {
    public   Circunferencia crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        Circunferencia c1 = new Circunferencia();
        System.out.println("Ingrese el radio");
        c1.setRadio(leer.nextDouble());
        return (c1);
    }

    public void area (Circunferencia c1){
        Scanner leer = new Scanner(System.in);
        double radio,area;
       area = Math.PI * Math.pow(c1.getRadio(),2);
        System.out.println("El area es: "+ area);
    }
    public void perimetro (Circunferencia c1){
        Scanner leer = new Scanner(System.in);
        double perimetro;
        perimetro = 2*Math.PI*c1.getRadio();
        System.out.println("El perimetro es: "+ perimetro);
    }
}
