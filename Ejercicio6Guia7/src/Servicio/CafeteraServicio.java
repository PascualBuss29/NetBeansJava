/*
 * Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class CafeteraServicio {

    Cafetera c1 = new Cafetera();

    public void capacidadMaxima(Cafetera c1) {
        c1.setCapacidadMaxima(500);
        System.out.println("La capacidad maxima de la cafetera es: " + c1.getCapacidadMaxima());
    }

    public void llenarCafetera(Cafetera c1) {

        c1.setCantidadActual(c1.getCapacidadMaxima());

    }

    public void servirTaza(Cafetera c1) {
        Scanner leer = new Scanner(System.in);
        int tamañoTaza;
        System.out.println("Ingrese el tamaño de la tasa");
        tamañoTaza = leer.nextInt();
        if (tamañoTaza > c1.getCantidadActual()) {
            System.out.println("Se sirve lo que hay: " + c1.getCantidadActual());
        } else {
            System.out.println("Su cafe esta servido");
            c1.setCantidadActual(c1.getCantidadActual() - tamañoTaza);
        }
    }

    public void vaciarCafetera(Cafetera c1) {
        c1.setCantidadActual(0);

    }

    public void agregarCafe(Cafetera c1) {
        Scanner leer = new Scanner(System.in);
        int agregarCafe;
        System.out.println("Ingrese la cantidad de cafe que desea agregar");
        agregarCafe = leer.nextInt();
        if (agregarCafe > c1.getCapacidadMaxima()) {
            System.out.println("La cantidad que desea agregar excede la capacidad maxima");
        } else {
            c1.setCantidadActual(c1.getCantidadActual() + agregarCafe);
        }
        System.out.println("La cantidad de cafe que queda es: " + c1.getCantidadActual());
    }
}
