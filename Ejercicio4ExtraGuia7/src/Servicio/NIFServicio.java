package Servicio;

import Entidad.NIF;
import java.util.Scanner;
//• Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
//corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
//resultado del calculo.
//• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
//mayúscula; por ejemplo: 00395469-F).
//La letra correspondiente al dígito verificador se calculará a traves de un método que
//funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el número
//de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe buscar en
//un array (vector) de caracteres la posición que corresponda al resto de la división para
//obtener la letra correspondiente. La tabla de caracteres es la siguiente:

public class NIFServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public NIF crearNIF() {
        NIF n1 = new NIF();
        System.out.println("Ingrese el numero de DNI");
        n1.setDNI(leer.nextLong());

        return new NIF(n1.getDNI(),calcularLetra(n1));
    }

    public static char calcularLetra(NIF n1) {
        char vector[] = new char[]{'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return vector[(int) n1.getDNI() % 23];
    }

    public void buscar(NIF n1) {
        String dni = Long.toString(n1.getDNI()), nif = "";
        for (int i = dni.length(); i < 8; i++) {
            nif = nif.concat("0");

        }
        nif = nif.concat(dni + "-" + n1.getLetra());
        System.out.println(nif);
    }
}
