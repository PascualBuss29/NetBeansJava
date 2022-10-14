/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10guia7;

import java.util.Arrays;

/**
 *
 * @author USUARIO
 */
public class Ejercicio10Guia7 {

    /**
     * Realizar un programa en Java donde se creen dos arreglos: el primero será
     * un arreglo A de 50 números reales, y el segundo B, un arreglo de 20
     * números, también reales. El programa deberá inicializar el arreglo A con
     * números aleatorios y mostrarlo por pantalla. Luego, el arreglo A se debe
     * ordenar de menor a mayor y copiar los primeros 10 números ordenados al
     * arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el
     * valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
     * elementos y el combinado de 20.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] a = new double[50], b = new double[20];
        System.out.println("VECTOR A");
        for (int i = 0; i < 50; i++) {
            a[i] = (double) Math.random() * 10;
            System.out.print(a[i] + " ");
        }
        Arrays.sort(a);
        System.out.println("\nVECTOR A ORDENADO");
        for (int i = 0; i < 50; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nVECTOR B");
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                b[i] = a[i];
            } else {
                b[i] = 0.5;
            }
            System.out.print(b[i] + " ");
        }
    }

}
