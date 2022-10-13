/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 * a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que
 * tiene la frase ingresada. b) Método invertirFrase(), deberá invertir la frase
 * ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca",
 * Salida: "acnalb asac". c) Método vecesRepetido(String letra), recibirá un
 * carácter ingresado por el usuario y contabilizar cuántas veces se repite el
 * carácter en la frase, por ejemplo: d) Entrada: frase = "casa blanca". Salida:
 * El carácter 'a' se repite 4 veces. e) Método compararLongitud(String frase),
 * deberá comparar la longitud de la frase que compone la clase con otra nueva
 * frase ingresada por el usuario. f) Método unirFrases(String frase), deberá
 * unir la frase contenida en la clase Cadena con una nueva frase ingresada por
 * el usuario y mostrar la frase resultante. g) Método reemplazar(String letra),
 * deberá reemplazar todas las letras “a” que se encuentren en la frase, por
 * algún otro carácter seleccionado por el usuario y mostrar la frase
 * resultante. h) Método contiene(String letra), deberá comprobar si la frase
 * contiene una letra que ingresa el usuario y devuelve verdadero si la contiene
 * y falso si no.
 *
 * @author USUARIO
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cadena c1 = new Cadena();

    public int mostrarVocales(Cadena c1) {
        c1.setLongitud(c1.getFrase().length());
        int vocal = 0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getFrase().substring(i, i + 1).equalsIgnoreCase("A") || c1.getFrase().substring(i, i + 1).equalsIgnoreCase("E") || c1.getFrase().substring(i, i + 1).equalsIgnoreCase("I") || c1.getFrase().substring(i, i + 1).equalsIgnoreCase("O") || c1.getFrase().substring(i, i + 1).equalsIgnoreCase("U")) {
                vocal++;
            }
        }
        return vocal;
    }

    public void invertirFrase(Cadena c1) {
        char letra;
        for (int i = c1.getLongitud() - 1; i > 0; i--) {
            letra = c1.getFrase().charAt(i);
            System.out.print(letra);
        }
    }

    public void vecesRepetido(Cadena c1) {
        int cont = 0;
        String let;
        System.out.println("Ingrese una letra a buscar");
        let = leer.next();
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getFrase().substring(i, i + 1).equalsIgnoreCase(let)) {
                cont++;
            }
        }
    }

    public void compararLongitud(Cadena c1) {
        String frase2;
        System.out.println("Ingrese una nueva frase");
        frase2 = leer.next();
        if (c1.getLongitud() == frase2.length()) {
            System.out.println("La longitudes son iguales");
        } else {
            System.out.println("Las longitudes son distintas");
        }
    }

    public void unirFrases(Cadena c1) {
        String frase3;
        System.out.println("Ingrese una nueva frase ");
        frase3 = leer.next();
        System.out.println(c1.getFrase().concat(frase3));
    }

    public void reemplazar(Cadena c1) {
        String car, letra, nuevaCadena="";
        System.out.println("Que letra de la frase queres cambiar");
        letra = leer.next();
        System.out.println("Ingrese un caracter");
        car = leer.next();
        for (int i = 0; i < c1.getLongitud(); i++) {
             nuevaCadena = c1.getFrase().replace(car, letra);
           
        }
         System.out.println(nuevaCadena);
         
    }
    public boolean contiene(Cadena c1, String letra){
        
        boolean res = c1.getFrase().contains(letra);       
        
        return res;
    }

}
