/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8guia7;

import Entidad.Cadena;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio8Guia7 {

    private static String letra;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Cadena c1 = new Cadena();

        System.out.println("Ingrese una frase");
        c1.setFrase(leer.next());
        c1.setLongitud(c1.getFrase().length());
        System.out.println("la frase contiene: " + c1.mostrarVocales(c1) + " vocales ");
        System.out.println("La frase invertida es: ");
        c1.invertirFrase(c1);
        System.out.println("La letra se repite: ");
        c1.vecesRepetido(c1);
        c1.compararLongitud(c1);
        c1.unirFrases(c1);
        System.out.println("Ingrese un caracter para reemplazar las letras: ");
        c1.reemplazar(c1, leer.next());
        System.out.println("Ingrese la letra a buscar");
        boolean res = c1.contiene(c1, leer.next());
        System.out.println(res);
    }

}
