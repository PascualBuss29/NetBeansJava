/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11guia7;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio11Guia7 {

    /**Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
      clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
      Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
      usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
      deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
      puede conseguir instanciando un objeto Date con constructor vacío.
      Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
      Ejemplo fecha actual: Date fechaActual = new Date();
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.print("Dia: "); int dia = leer.nextInt();
        System.out.print("Mes: "); int mes = leer.nextInt(); mes = mes -1;
        System.out.print("Año: "); int anio = leer.nextInt(); anio = anio-1900;
        Date fechaActual = new Date();
        Date fechaIngresada = new Date(anio,mes,dia);
        System.out.println("Fecha actual: " + fechaActual.toString());
        System.out.println("Fecha ingresada: " + fechaIngresada.toString());
        int difAnios = Math.abs(fechaActual.getYear() - fechaIngresada.getYear());
        if(difAnios == 0){
            System.out.println("Son el mismo año.");
        }else System.out.println("Hay " + difAnios + " años diferencia.");

    }
    
}
