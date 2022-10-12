/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4guia7;

import Entidad.Rectangulo;
import Servicio.RectanguloServicio;

/**
 *
 * @author USUARIO
 */
public class Ejercicio4Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        RectanguloServicio rs = new RectanguloServicio();
        Rectangulo r1 = rs.crearRectangulo();
        
        rs.perimetro(r1);
        rs.superficie(r1);
        rs.dibujarRectangulo(r1);

    }

}
