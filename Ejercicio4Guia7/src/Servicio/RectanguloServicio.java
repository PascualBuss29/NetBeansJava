/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class RectanguloServicio {

    public Rectangulo crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        Rectangulo r1 = new Rectangulo();
        System.out.println("Ingrese la base del rectangulo");
        r1.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura del rectangulo");
        r1.setAltura(leer.nextDouble());
        return (r1);
    }

    public void superficie(Rectangulo r1) {
        double superficie;
        superficie = r1.getBase() * r1.getAltura();
        System.out.println("La superficie del rectangulo es: " + superficie);
    }

    public void perimetro(Rectangulo r1) {
        double perimetro;
        perimetro = (r1.getBase() + r1.getAltura()) * 2;
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }

    public void dibujarRectangulo(Rectangulo r1) {
        for (int i = 0; i < r1.getAltura(); i++) {
            for (int j = 0; j < r1.getBase(); j++) {
                if ((i == 0 || i == r1.getAltura() - 1) || (j == 0 || j == r1.getBase() - 1)) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }
}
