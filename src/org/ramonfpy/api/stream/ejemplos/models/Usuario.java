package org.ramonfpy.api.stream.ejemplos.models;

import java.util.Objects;

public class Usuario {
    private Integer id;
    private String nombre;
    private String apellido;
    private  static Integer ultimoId = 0;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido) {
        this.id = ++ultimoId;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nombre, usuario.nombre) && Objects.equals(apellido, usuario.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }

    @Override
    public String toString() {
        return id + " " + nombre + " " + apellido;
    }
}
