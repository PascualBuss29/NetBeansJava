/*
 * Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
//usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
//Si no es correcto se deberá mostrar un mensaje
//• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
//que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
//fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
//está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
//fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//función devuelve un 1.
//• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
//un booleano.
//
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class PersonaServicio {

    public Persona crearPersona() {       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona p1 = new Persona();
        String H, M, O;

        System.out.println("Ingrese el nombre de la persona");
        p1.setNombre(leer.nextLine());
        System.out.println("Ingrese la edad");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese el sexo");
        p1.setSexo(leer.next());
        if (p1.getSexo().equalsIgnoreCase("H") || p1.getSexo().equalsIgnoreCase("M") || p1.getSexo().equalsIgnoreCase("O")) {

        } else {
            System.out.println("Error, ingrese nuevamente el sexo");
            System.out.println("Ingrese el sexo");
            p1.setSexo(leer.next());
        }
        System.out.println("Ingrese el peso");
        p1.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura en metros");
        p1.setAltura(leer.nextDouble());
        return (p1);
    }

    public void calcularImc(Persona p1) {
        double IMC;
        double imc1;
         imc1 =  p1.getPeso() / Math.pow(p1.getAltura(),2);
        //
        if (imc1 < 20) {
            IMC = -1;
        } else if (imc1 >= 20 && imc1<=25) {
            IMC = 0;
        } else {
            IMC = 1;
        }
       p1.setIMC((double)IMC);
    }

    public boolean esMayorDeEdad(Persona p1) {
        boolean edad = true;
        if (p1.getEdad() < 18) {
            edad = false;
        }
        if (edad == true) {
            edad = true;
        } else {
        }
        return edad;
    }
}
