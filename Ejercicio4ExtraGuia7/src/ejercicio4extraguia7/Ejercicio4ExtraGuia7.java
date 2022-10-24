
package ejercicio4extraguia7;

import Entidad.NIF;
import Servicio.NIFServicio;
import static Servicio.NIFServicio.calcularLetra;


public class Ejercicio4ExtraGuia7 {

    
    public static void main(String[] args) {
        NIFServicio n2 = new NIFServicio();
        NIF n1 = n2.crearNIF();
        calcularLetra( n1);
        n2.buscar(n1);
    }
    
}
