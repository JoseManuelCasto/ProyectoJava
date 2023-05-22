/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carri
 */
public class Datos implements Serializable {
    //atributos
    protected List<Usuario> usuarios;
    protected List<Tarea> tareas;
    protected List<Proyecto> proyectos;
    //constructor
    public Datos(List<Usuario> usuarios, List<Tarea> tareas, List<Proyecto> proyectos) {
        this.usuarios = usuarios;
        this.tareas = tareas;
        this.proyectos = proyectos;
    }
    //Inicicializo las listas en otro constructor
    public Datos() {
        usuarios = new ArrayList<>();
        tareas = new ArrayList<>();
        proyectos = new ArrayList<>();
    }
    //getter y setter
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }
    //toString
    @Override
    public String toString() {
        return usuarios.toString() + tareas.toString() + proyectos.toString();
    }
    //metodo para cargar los datos del archivo
    public static Datos cargarDatos() {
        Datos dat;
        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("datos.bin"));
            dat = (Datos) entrada.readObject();
            entrada.close();
        } catch (IOException io) {
            dat = new Datos();
        } catch (ClassNotFoundException ex) {
            dat = new Datos();
        }
        return dat;
    }
    //metodo para guardar los datos en un archivo
    public static void guardarDatos(Datos dat) {
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("datos.bin"));
            salida.writeObject(dat);
            salida.close();
        } catch (IOException io) {

        }
    }
    //metodos para añadir objetos a sus respectivas listas
    public void añadirUsuario(Usuario u) {
        usuarios.add(u);
    }
    public void añadirTarea(Tarea t) {
        tareas.add(t);
    }
    public void añadirProyecto(Proyecto p) {
        proyectos.add(p);
    }
}
