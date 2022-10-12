/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class OperacionServicio {
    public Operacion crearOperacion(){ 
        Scanner leer = new Scanner(System.in); 
        Operacion o1 = new Operacion();
        System.out.println("Ingrese 1 numero entero positivo");
        o1.setNumero1(leer.nextInt());
        System.out.println("Ingrese un nuevo numero entero positivo");
        o1.setNumero2(leer.nextInt());
        return (o1);
    }
    public void suma(Operacion o1){
        int suma;
        suma = o1.getNumero1()+o1.getNumero2();
        System.out.println("La suma de los numeros es: "+suma);
    }
    public void resta(Operacion o1){
        int resta;
        resta = o1.getNumero1()-o1.getNumero2();
        System.out.println("La resta de los numeros es: "+resta);
    }
    public void multiplicar(Operacion o1){
        int multiplicar;
        if(o1.getNumero1()>0 && o1.getNumero2()>0){
        multiplicar = o1.getNumero1()*o1.getNumero2();
        }else{
            multiplicar=0;
            System.out.println("El numero ingresado es incorrecto");
        }
        System.out.println("La multiplicacion de los numeros es: "+multiplicar);
    }
    public void dividir(Operacion o1){
        int dividir;
        if(o1.getNumero1()>0 && o1.getNumero2()>0){
        dividir = o1.getNumero1()/o1.getNumero2();
        }else{
            dividir=0;
            System.out.println("El numero ingresado es incorrecto");
        }
        System.out.println("La division de los numeros es: "+dividir);
    }
}
