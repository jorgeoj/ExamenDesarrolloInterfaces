package com.example.examendesarrollointerfaces.clientes;

public class Cliente {
    private String id;
    private String nombre;
    private String correo;

    public Cliente(String id, String nombre, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
    }

    public Cliente() {
    }

    public String getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String toString() {
        return "Cliente(id=" + this.getId() + ", nombre=" + this.getNombre() + ", correo=" + this.getCorreo() + ")";
    }
}
