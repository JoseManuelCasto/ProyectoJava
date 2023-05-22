/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author casto
 */
public class Proyecto implements Serializable, Comparable<Proyecto> {
    //atributos
    protected String nombre;
    protected Set<Tarea> tareas;
    protected LocalDate fecha_inicio;
    protected LocalDate fecha_entrega;
    //constructor
    public Proyecto(String nombre, LocalDate fecha_inicio, LocalDate fecha_entrega) {
        this.nombre = nombre;
        this.tareas = new HashSet();
        this.fecha_inicio = fecha_inicio;
        this.fecha_entrega = fecha_entrega;

    }
    //getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(Set<Tarea> tareas) {
        this.tareas = tareas;
    }

    public LocalDate getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(LocalDate fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }
    //toString
    @Override
    public String toString() {
        //para que solo salga el titulo de las tareas de la lista de tareas formamos una cadena de String
        //con un bucle que recorra toda la lista y concatene todos los titulo de las tareas en un solo String
        String tareascadena = "";
        for (Tarea tarea : tareas) {
            tareascadena += tarea.getTitulo() + "; ";
        }

        return "nombre:" + nombre
                + ", tareas:" + tareascadena
                + ", fechaInicio:" + fecha_inicio
                + ", fechaEntrega:" + fecha_entrega;
    }
    //compareto por defecto
    @Override
    public int compareTo(Proyecto p) {
        return this.fecha_entrega.compareTo(p.fecha_entrega);
    }
    //metodos para añadir y eliminar tareas
    public void añadirTarea(Tarea t) {
        tareas.add(t);
    }

    public void elimninarTarea(Tarea t) {
        tareas.remove(t);
    }

}
