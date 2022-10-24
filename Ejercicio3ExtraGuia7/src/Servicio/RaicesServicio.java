/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class RaicesServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Raices crearRaiz() {
        Raices r1 = new Raices();
        System.out.println("Ingrese el valor de a");
        r1.setA(leer.nextInt());
        System.out.println("Ingrese el valor de b");
        r1.setB(leer.nextInt());
        System.out.println("Ingrese el valor de c");
        r1.setC(leer.nextInt());
        return (r1);
    }

    public double getDiscriminante(Raices r1) {
        return Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC();
    }

    public boolean tieneRaices(Raices r1) {
        return getDiscriminante(r1) >= 0;
    }

    public boolean tieneRaiz(Raices r1) {
        return getDiscriminante(r1) == 0;
    }

    public void obtenerRaices(Raices r1) {
        if (tieneRaices(r1) == true) {
            double x1 = (double) (-r1.getB() + Math.sqrt(getDiscriminante(r1))) / 2 * r1.getA();
            double x2 = (double) (-r1.getB() - Math.sqrt(getDiscriminante(r1))) / 2 * r1.getA();
            System.out.println("Las posbles soluciones son :" + x1 + " y " + x2);
        }

    }

    public void obtenerRaiz(Raices r1) {
        if (tieneRaiz(r1) == true) {
            double raiz = (double) (-r1.getB() / 2 * r1.getA());
            System.out.println("La solucion es: " + raiz);
        }
    }

    public void calcular(Raices r1) {
        if (tieneRaiz(r1)) {
            obtenerRaiz(r1);
        } else if (tieneRaices(r1) == true) {
            obtenerRaices(r1);
        } else {
            System.out.println("No tiene raices por que el discriminante es menor a 0");
        }
    }
}
    

//(-b±√((b^2)-(4*a*c)))/(2*a)
