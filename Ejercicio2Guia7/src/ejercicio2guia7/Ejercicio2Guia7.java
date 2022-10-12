/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2guia7;

import Entidad.Circunferencia;
import Servicio.CircunferenciaServicio;

/**
 *
 * @author USUARIO
 */
public class Ejercicio2Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircunferenciaServicio cs = new CircunferenciaServicio();
        Circunferencia c1 = cs.crearCircunferencia();
        cs.area(c1);
        cs.perimetro(c1);
    }
    
}
