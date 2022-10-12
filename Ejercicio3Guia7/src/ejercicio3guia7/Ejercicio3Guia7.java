/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3guia7;

import Entidad.Operacion;
import Servicio.OperacionServicio;

/**
 *
 * @author USUARIO
 */
public class Ejercicio3Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      OperacionServicio os = new OperacionServicio();
      Operacion o1 = os.crearOperacion();       
       os.suma(o1);
       os.resta(o1);
       os.multiplicar(o1);
       os.dividir(o1);      
    }
    
}
