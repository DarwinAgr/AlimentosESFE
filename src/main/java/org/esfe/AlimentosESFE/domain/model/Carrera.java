package org.esfe.AlimentosESFE.domain.model;

public class Carrera {
    private String id;
    private String nombre;
    private Boolean activo;

    //Constructor
    public Carrera(String nombre) {
        this.nombre = nombre;
        this.activo = true;
    }

    public Carrera(String id, String nombre, Boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.activo = activo;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean getActivo() {
        return activo;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}
