
package Entidad;
//Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
//atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
//jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
//parámetros que sean necesarios:
//• Constructores, tanto el vacío como el parametrizado.

public class Ahorcado {
   private String [] boca;
   private int cantLetras;
   private int cantJugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] boca, int cantLetras, int cantJugadas) {
        this.boca = boca;
        this.cantLetras = cantLetras;
        this.cantJugadas = cantJugadas;
    }

    public String[] getBoca() {
        return boca;
    }

    public void setBoca(String[] boca) {
        this.boca = boca;
    }

    public int getCantLetras() {
        return cantLetras;
    }

    public void setCantLetras(int cantLetras) {
        this.cantLetras = cantLetras;
    }

    public int getCantJugadas() {
        return cantJugadas;
    }

    public void setCantJugadas(int cantJugadas) {
        this.cantJugadas = cantJugadas;
    }

    public void setBoca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
