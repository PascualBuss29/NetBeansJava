/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5guia7;

import Entidad.Cuenta;
import Servicio.CuentaServicio;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio5Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        CuentaServicio cs = new CuentaServicio();
        Cuenta r1 = cs.crearCuenta();

        do {

            System.out.println("-----------------");
            System.out.println("Ingrese su opcion \n"
                    + "1. ingresar saldo\n"
                    + "2. retirar saldo\n"
                    + "3. extracción rápida\n"
                    + "4. consultar saldo\n"
                    + "5. datos de la cuenta\n"
                    + "6. salir\n");
            System.out.println("-----------------");
            opcion = leer.nextInt();
            System.out.println("-----------------");

            switch (opcion) {
                case 1:
                    cs.doubleIngreso(r1);
                    break;
                case 2:
                    cs.retirar(r1);
                    break;
                case 3:
                    cs.extraccionRapida(r1);
                    break;
                case 4:
                    cs.consultaSaldo(r1);
                    break;
                case 5:
                    cs.consultarDatos(r1);
                    break;
                case 6:
                    System.out.println("Estas seguro que desea salir? S/N");
                    String confirma = leer.next();
                    if (confirma.equals("s")) {
                        System.out.println("El programa a finalizado");
                        break;
                    }
                    default:
                    {
                        System.out.println("Opcion incorrecta");

                    }

            }

        } while (opcion != 6);
    }
}
