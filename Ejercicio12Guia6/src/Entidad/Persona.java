/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**Agregar a la clase el método
     * menorQue(int edad) que recibe como parámetro otra edad y retorna true en
     * caso de que el receptor tenga menor edad que la persona que se recibe
     * como parámetro, o false en caso contrario. • Metodo mostrarPersona():
     * este método muestra la persona creada en el método anterior.
 *
 * @author USUARIO
 */
public class Persona {

    private String nombre;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

   
   }
    
    

