/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

import java.io.Serializable;

/**
 *
 * @author usuario
 */
public class Persona implements Serializable{

    //Atributos
    protected String Nombre;
    protected String Apellido1;
    protected String Apellido2;
    protected String DNI;
    protected String Direccion;
    protected String Sexo;

    //Constructor
    public Persona(String Nombre, String Apellido1, String Apellido2, String DNI, String Direccion, String Sexo) {
        this.Nombre = Nombre;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.DNI = DNI;
        this.Direccion = Direccion;
        this.Sexo = Sexo;
    }

    //Getter y setter
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    //to String
    @Override
    public String toString() {
        return Nombre + "\n" + Apellido1 + "\n" + Apellido2 + "\n" + DNI + "\n" + Direccion + "\n" + Sexo;
    }

}
