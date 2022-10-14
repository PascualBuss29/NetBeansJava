/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9guia7;

import Entidad.Matematica;
import java.util.Scanner;

/**
 * Realizar una clase llamada Matemática que tenga como atributos dos números
 * reales con los cuales se realizarán diferentes operaciones matemáticas. La
 * clase deber tener un constructor vacío, parametrizado y get y set. En el main
 * se creará el objeto y se usará el Math.random para generar los dos números y
 * se guardaran en el objeto con su respectivos set. Deberá además implementar
 * los siguientes métodos: a) Método devolverMayor() para retornar cuál de los
 * dos atributos tiene el mayor valor b) Método calcularPotencia() para calcular
 * la potencia del mayor valor de la clase elevado al menor número. Previamente
 * se deben redondear ambos valores. c) Método calculaRaiz(), para calcular la
 * raíz cuadrada del menor de los dos valores. Antes de calcular la raíz
 * cuadrada se debe obtener el valor absoluto del número.
 *
 * @author USUARIO
 */
public class Ejercicio9Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Matematica m1 = new Matematica();
        m1.setNum1(Math.random() * 10);
        m1.setNum2(Math.random() * 10);
        System.out.println(m1.toString());
        System.out.println("El mayor es: " + m1.devolverMayor());
        m1.devolverPotencia();
        m1.calcularRaiz();
    }

}
