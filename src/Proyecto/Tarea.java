/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author Usuario
 */
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Tarea implements Comparable<Tarea>, Serializable {
    //atributos
    protected String Titulo;
    protected String Descripcion;
    protected LocalDate fecha_inicio;
    protected LocalDate fecha_estimada;
    protected LocalDate fecha_fin;
    protected Set<Usuario> usuarios;
    protected boolean enProyecto;
    //constructor
    public Tarea(String titulo, String descripcion, LocalDate fecha_inicio, LocalDate fecha_estimada, LocalDate fecha_fin) {
        this.Titulo = titulo;
        this.Descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_estimada = fecha_estimada;
        this.fecha_fin = fecha_fin;
        this.usuarios = new HashSet<>();
        this.enProyecto = false;
    }
    //getter y setter
    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_estimada() {
        return fecha_estimada;
    }

    public void setFecha_estimada(LocalDate fecha_estimada) {
        this.fecha_estimada = fecha_estimada;
    }

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Usuario> Usuarios) {
        this.usuarios = Usuarios;
    }

    public boolean isEnProyecto() {
        return enProyecto;
    }

    public void setEnProyecto(boolean enProyecto) {
        this.enProyecto = enProyecto;
    }
    //toString
    @Override
    //para que solo salga el nombre de usuario de la lista de usuarios formamos una cadena de String
    //con un bucle que recorra toda la lista y concatene todos los nombres de usuario en un solo String
    public String toString() {
        String nombreUsuarios = "";
        for (Usuario usuario : usuarios) {
            nombreUsuarios += usuario.getNombre_usuario() + "; ";
        }

        return Titulo + ", " + Descripcion + ", " + "Fecha de inicio: " + fecha_inicio + ", "
                + "Fecha estimada: " + fecha_estimada + ", " + "Fecha fin" + fecha_fin + ", " + "\n Usuarios: " + nombreUsuarios + "\n";
    }
    //compareto por defecto
    @Override
    public int compareTo(Tarea t) {
        return this.fecha_fin.compareTo(t.fecha_fin);
    }
    //metodo para añadir un usuario
    public void añadirUsuario(Usuario u) {
        usuarios.add(u);
    }
}
