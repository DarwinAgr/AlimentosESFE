package org.esfe.AlimentosESFE.domain.model;

public class Grupo {
    private Integer id;
    private String nombre;
    private String anio;
    private String turno;
    private Integer carreraId;
    private Boolean activo;

    public Grupo(String nombre, String anio, String turno, Integer carreraId) {
        this.nombre = nombre;
        this.anio = anio;
        this.turno = turno;
        this.carreraId = carreraId;
        this.activo = true;
    }

    public Grupo(Integer id, String nombre, String anio, String turno, Integer carreraId, Boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.anio = anio;
        this.turno = turno;
        this.carreraId = carreraId;
        this.activo = activo;
    }

    // Getters y setters

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

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Integer getCarreraId() {
        return carreraId;
    }

    public void setCarreraId(Integer carreraId) {
        this.carreraId = carreraId;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}

