/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7guia7;

import Entidad.Persona;
import Servicio.PersonaServicio;
import java.util.Scanner;

/**
 * A continuación, en la clase main hacer lo siguiente: //Crear 4 objetos de
 * tipo Persona con distintos valores, a continuación, llamaremos todos //los
 * métodos para cada objeto, deberá comprobar si la persona está en su peso
 * ideal, tiene //sobrepeso o está por debajo de su peso ideal e indicar para
 * cada objeto si la persona es //mayor de edad. //Por último, guardaremos los
 * resultados de los métodos calcularIMC y esMayorDeEdad en //distintas
 * variables, para después en el main, calcular un porcentaje de esas 4 personas
 * //cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos,
 * por encima, y //también calcularemos un porcentaje de cuantos son mayores de
 * edad y cuantos menores.
 *
 * @author USUARIO
 */
public class Ejercicio7Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaServicio ps = new PersonaServicio();
        Persona[] pers = new Persona[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Carga de persona" + (i + 1));
            pers[i] = ps.crearPersona();
        }
        int peso = 0, peso1 = 0, peso2 = 0, opcion;
        do {
            System.out.println("menu\n"
                    + "1.evaluacion IMC\n"
                    + "2.evaluacion edad\n"
                    + "3.salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    for (int i = 0; i < 4; i++) {
                        if (pers[i].getIMC() == -1) {
                            peso++;
                        } else if (pers[i].getIMC() == 0) {
                            peso1++;
                        } else if (pers[i].getIMC() == 1) {
                            peso2++;
                        }
                    }

                    System.out.println("el porcentaje de personas con bajo peso es " + (peso * 100 / 4) + " %");
                    System.out.println("el porcentaje de personas con peso normal es " + (peso1 * 100 / 4) + " %");
                    System.out.println("el porcentaje de personas con exceso de peso es " + (peso2 * 100 / 4) + " %");
                    break;
                case 2:
                    int mayor = 0,
                     menor = 0;
                    for (int i = 0; i < 4; i++) {
                        if (ps.esMayorDeEdad(pers[i]) == true) {
                            mayor++;
                        } else {
                            menor++;
                        }

                    }
                    System.out.println("el porcentaje de personas mayor de edad es " + mayor * 100 / 4 + " %");
                    System.out.println("el porcentaje de personas menores de edad es " + menor * 100 / 4 + " %");
                    break;
                case 3:
                    System.out.println("usted ha salido del menu");
                    break;

            }

        } while (opcion != 3);

    }

}


