/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8guia7;

import Entidad.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio8Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaServicio s1 = new CadenaServicio();
        Cadena c1 = new Cadena();
        
        System.out.println("Ingrese una frase");
        c1.setFrase(leer.next());
        c1.setLongitud(c1.getFrase().length());
        System.out.println("la frase contiene: " + s1.mostrarVocales(c1) + "vocales");
        s1.invertirFrase(c1);
        s1.compararLongitud(c1);
        s1.unirFrases(c1);
        s1.reemplazar(c1);
        s1.contiene(c1, letra);
    }

}
