/*
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
 */
package Entidad;

/**
 *
 * @author USUARIO
 */
public class Circunferencia {
private double radio;
private double area;
private double perimetro;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
 

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
       
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }

   
    }



