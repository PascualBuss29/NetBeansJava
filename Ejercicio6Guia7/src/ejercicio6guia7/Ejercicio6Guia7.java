/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6guia7;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;

/**
 *
 * @author USUARIO
 */
public class Ejercicio6Guia7 {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera c1 = new Cafetera();
        cs.capacidadMaxima(c1);
        cs.llenarCafetera(c1);
        cs.servirTaza(c1);
        cs.agregarCafe(c1);
        cs.vaciarCafetera(c1);

    }

}
