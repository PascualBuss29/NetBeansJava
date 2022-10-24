/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extraguia7;

import Entidad.Raices;
import Servicio.RaicesServicio;

/**
 *
 * @author USUARIO
 */
public class Ejercicio3ExtraGuia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaicesServicio sr = new RaicesServicio();
        Raices r1 = sr.crearRaiz();
        sr.calcular(r1);
    }

}
