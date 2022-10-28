/*
Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????
 */
package Servicio;

import Entidades.Tiempo;
import java.sql.Time;
import java.util.*;

/**
 *
 * @author usuario
 */
public class ServicioTiempo {

    Tiempo t1 = new Tiempo();
    Scanner leer = new Scanner(System.in);

    public Date llenarTiempo() {
        System.out.println("Ingrese la hora, minutos y segundos");
        t1.setHora(leer.nextInt());
        t1.setMinutos(leer.nextInt());
        t1.setSegundos(leer.nextInt());
        Time d1 = new Time(t1.getHora(), t1.getMinutos(), t1.getSegundos());
        System.out.println(d1);
        return d1;
    }

    public void corroborar(Date d1) {
        Date d2 = new Date();
        if ((d2.getHours() == d1.getHours()) && (d2.getMinutes() == d1.getMinutes()) && (d2.getSeconds() == d1.getSeconds())) {
            System.out.println("La hora ingresada coincide con la hora actual");

        } else {
            System.out.println("La hora ingresada no coincide con la hora actual");
            System.out.println("La hora actual es: " + d2.getHours() + ":" + d2.getMinutes() + ":" + d2.getSeconds());
        }
    }

}
