/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona p1 = new Persona();
    
    public Persona crearPersona(Persona p1){
        System.out.println("Ingrese el nombre de la persona");
        p1.setNombre(leer.next());
        System.out.println("Ingrese la fecha de nacimiento");
        System.out.print("Dia: "); int dia = leer.nextInt();
        System.out.print("Mes: "); int mes = leer.nextInt(); mes = mes - 1;
        System.out.print("Año: "); int anio = leer .nextInt(); anio = anio - 1900;
        Date nacimiento = new Date(anio,mes,dia);
        p1.setFechaNacimiento(nacimiento);
        return (p1);
    }
    public int calcularEdad(Persona p1){
       int edad;
       Date fechaActual = new Date();
       edad=fechaActual.getYear()- p1.getFechaNacimiento().getYear(); 
       return  edad;
    }
    public boolean menorQue(Persona p1) {       
        int edad2;
        System.out.println("Ingrese una nueva edad");
        edad2 = leer.nextInt();
        boolean Menor = false;
        if(edad2 < calcularEdad(p1)  ) {
            Menor = true;
        
        }
        return Menor;
    }
}
