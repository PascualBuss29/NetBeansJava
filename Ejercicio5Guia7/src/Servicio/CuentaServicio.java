/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class CuentaServicio {
    public Cuenta crearCuenta(){
        Scanner leer = new Scanner(System.in);
        Cuenta c1 = new Cuenta();
        System.out.println("Ingrese el numero de cuenta");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el DNI");
        c1.setDNI(leer.nextLong());
        System.out.println("Ingrese el saldo");
        c1.setSaldo(leer.nextInt());
        return(c1);
    }
    public void doubleIngreso (Cuenta c1){
        Scanner leer = new Scanner(System.in);
        double sueldo;
        System.out.println("Ingrese el sueldo");
        sueldo = leer.nextDouble();
        c1.setSaldo(c1.getSaldo()+(int) (sueldo));
        System.out.println("El saldo de la cuenta es: "+ c1.getSaldo());        
    }
    public void retirar (Cuenta c1){
        Scanner leer = new Scanner(System.in);
        double retirar;
        System.out.println("Ingrese el monto a retirar");
        retirar = leer.nextDouble();
        if(c1.getSaldo()< retirar){
            System.out.println("El saldo es insuficiente");
        }else{
        c1.setSaldo(c1.getSaldo() -(int) retirar);
        System.out.println("El saldo de la cuenta es: "+ c1.getSaldo());
    }
    }
    public void extraccionRapida(Cuenta c1){
        Scanner leer = new Scanner(System.in);
        double extraccion;
        System.out.println("Ingresar el monto a retirar, recuerde que no debe superar el 20%");
        extraccion = leer.nextDouble();
        if(extraccion > c1.getSaldo()*0.2){
            System.out.println("No puede retirar mas del 20% de su saldo");
        }else{
            c1.setSaldo(c1.getSaldo()-(int) extraccion);
            System.out.println("Su saldo es: "+ c1.getSaldo());
        }
    }
    public void consultaSaldo (Cuenta c1){
        System.out.println("Su saldo actual es: "+ c1.getSaldo());
    }
    public void consultarDatos (Cuenta c1){
        System.out.println("Los datos de la cuenta son: "+c1.toString());
    }
}
