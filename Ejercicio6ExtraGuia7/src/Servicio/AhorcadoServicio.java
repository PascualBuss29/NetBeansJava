package Servicio;
//Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
//la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.

import Entidad.Ahorcado;
import java.util.Scanner;

//Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
//palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
//valor que ingresó el usuario y encontradas en 0.
//Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
//buscar como se usa el vector.length.
public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado a1 = new Ahorcado();
    String palabra;
    private String[] vector;
    private boolean let;

    public void crearAhorcado(Ahorcado a1) {
        System.out.println("Ingrese una palabra");
        palabra = leer.next();
        System.out.println("Ingrese la cantidad de jugadas maximas");
        a1.setCantJugadas(leer.nextInt());

        vector = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            vector[i] = palabra.substring(i, i + 1);
        }
        a1.setBoca(vector);
    }

    public void Longitud(Ahorcado a1) {
        System.out.println("La longitud es: " + palabra.length());
    }

    public boolean buscarLetra(String letra) {
        vector = a1.getBoca();
        for (int i = 0; i < a1.getBoca().length; i++) {
            if (vector[i].equalsIgnoreCase(letra)) {
                let = true;
                a1.setCantLetras(a1.getCantLetras() + 1);
            }
        }

        return let;

    }

    public void encontradas() {
        System.out.println("Se encontraron: " + a1.getCantLetras() + "," + palabra.length());
    }

    public int intentos(Ahorcado n1) {
        return n1.getCantJugadas();
    }

    public void juego() {
        crearAhorcado(a1);
        String letra;
        do {
            Longitud(a1);
            System.out.println("Ingrese una letra");
            letra = leer.next();
            if (buscarLetra(letra)) {
                System.out.println("La letra se encontro");
            } else {
                System.out.println("No se encontro la letra");
                a1.setCantJugadas(a1.getCantJugadas() - 1);
            }
            encontradas();
            System.out.println("Te quedan: " + a1.getCantJugadas() + "Oportunidades");

        } while (a1.getCantJugadas() > 0 && a1.getCantJugadas() <= palabra.length());
        if (a1.getCantLetras() == palabra.length()) {
            System.out.println("Se encontraron todas las letras");
        }
    }
}
