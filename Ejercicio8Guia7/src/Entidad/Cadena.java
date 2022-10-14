/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 * Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo
 * de String) y su longitud. En el main se creará el objeto y se le pedirá al
 * usuario que ingrese una frase que puede ser una palabra o varias palabras
 * separadas por un espacio en blanco y a través de los métodos set, se guardará
 * la frase y la longitud de manera automática según la longitud de la frase
 * ingresada. Deberá además implementar los siguientes métodos:
 *
 * @author USUARIO
 */
public class Cadena {

    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

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
        for (int i = c1.getLongitud() - 1; i >= 0; i--) {
            letra = c1.getFrase().charAt(i);
            System.out.print(letra);
        }

    }

    public void vecesRepetido(Cadena c1) {
        int cont = 0;
        String let;
        System.out.println("\nIngrese una letra a buscar");
        let = leer.next();
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getFrase().substring(i, i + 1).equalsIgnoreCase(let)) {
                cont++;
            }
        }
        System.out.println("La letra se repite: " + cont + " veces");
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

    public void reemplazar(Cadena c1, String letra) {
        String nuevaCadena = c1.getFrase().replace("a", letra);
        System.out.println(nuevaCadena);

    }

    public boolean contiene(Cadena c1, String letra) {

        boolean res = c1.getFrase().contains(letra);

        return res;
    }

}
