package com.proyecto.tf.models;

import java.util.Calendar;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tb_trofeos")
public class Competicion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long competicionId;

    private String nombre;

    @Temporal(TemporalType.TIME)
    private Calendar fechaCreacion;

    private String descripcion;
    private String imagen;
    private int totalganadores;

    public Competicion() {
    
    }

    public Long getCompeticionId() {
        return competicionId;
    }

    public void setCompeticionId(Long competicionId) {
        this.competicionId = competicionId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Calendar fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getTotalganadores() {
        return totalganadores;
    }

    public void setTotalganadores(int totalganadores) {
        this.totalganadores = totalganadores;
    }

    
}
