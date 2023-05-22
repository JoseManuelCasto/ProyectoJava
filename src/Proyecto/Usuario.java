/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Carri
 */
public class Usuario extends Persona implements Comparable<Usuario>, Serializable{

    //Atributos
    protected String Nombre_usuario;
    protected String Contraseña;
    protected String Frase_Seguridad;
    protected Set<Proyecto> proyectos;
    protected Set<Tarea> tareas;

    //constructor
    public Usuario(String Nombre, String Apellido1, String Apellido2, String DNI, String Direccion, String Sexo, String Contraseña, String Frase_Seguridad) {
        super(Nombre, Apellido1, Apellido2, DNI, Direccion, Sexo);
        this.Frase_Seguridad = Frase_Seguridad;
        this.Contraseña = Contraseña;
        //Aqui se mantienen en una variable los dos primeros caracteres para 
        //formar una cadena que se convierta en el nombre de usuario
        String parteNombre = Nombre.substring(0, 2);
        String parteApellido1 = Apellido1.substring(0, 2);
        String parteApellido2 = Apellido2.substring(0, 2);
        String parteDNI = DNI.substring(0, 2);

        this.Nombre_usuario = parteNombre + parteApellido1 + parteApellido2 + parteDNI;
        //Inicializamos una lista vacia de proyectos y tareas por defecto
        proyectos =new HashSet<>();
        tareas = new HashSet<>();
    }
    
        //getter y setter
    public String getNombre_usuario() {
        return Nombre_usuario;
    }

    public void setNombre_usuario(String Nombre_usuario) {
        this.Nombre_usuario = Nombre_usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getFrase_Seguridad() {
        return Frase_Seguridad;
    }

    public void setFrase_Seguridad(String Frase_Seguridad) {
        this.Frase_Seguridad = Frase_Seguridad;
    }

    public Set<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(Set<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

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

    public Set<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(Set<Tarea> tareas) {
        this.tareas = tareas;
    }
    //toString
    @Override
    public String toString() {
        return Nombre+" " + Apellido1+" "+ Apellido2+
                ", "+ "DNI: "+DNI+ ", " + "Direccion: "+Direccion+", "+ "Sexo: "+Sexo+
                ", " +"Nombre_Usuario: "+Nombre_usuario+", " +"\n";
    }
    //metodo compare por defecto
    @Override
    public int compareTo(Usuario u) {
        return this.Apellido1.compareToIgnoreCase(u.Apellido1);
    }  
    //metodo para añadir una tarea
    public void añadirTarea(Tarea t){
        tareas.add(t);
    }
}
