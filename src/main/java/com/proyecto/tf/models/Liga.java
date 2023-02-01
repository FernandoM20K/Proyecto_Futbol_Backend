package com.proyecto.tf.models;

import java.util.Calendar;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_ligas")
public class Liga {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ligaId;
    private String paisCompeticion;
    private String nombre;
    private Calendar fechaCreacion;
    private String descripcion;
    private int totalEquipos;
    private int desensos;
    private int ascensos;
    private int totalJornadas;
    private int totalGanadores;
    private String logoCompeticion;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "liga")
    @JsonIgnore
    private List<Club> clubes;

    public Liga() {

    }

    public Long getLigaId() {
        return ligaId;
    }

    public void setLigaId(Long ligaId) {
        this.ligaId = ligaId;
    }

    public String getPaisCompeticion() {
        return paisCompeticion;
    }

    public void setPaisCompeticion(String paisCompeticion) {
        this.paisCompeticion = paisCompeticion;
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

    public int getTotalEquipos() {
        return totalEquipos;
    }

    public void setTotalEquipos(int totalEquipos) {
        this.totalEquipos = totalEquipos;
    }

    public int getDesensos() {
        return desensos;
    }

    public void setDesensos(int desensos) {
        this.desensos = desensos;
    }

    public int getAscensos() {
        return ascensos;
    }

    public void setAscensos(int ascensos) {
        this.ascensos = ascensos;
    }

    public int getTotalJornadas() {
        return totalJornadas;
    }

    public void setTotalJornadas(int totalJornadas) {
        this.totalJornadas = totalJornadas;
    }

    public int getTotalGanadores() {
        return totalGanadores;
    }

    public void setTotalGanadores(int totalGanadores) {
        this.totalGanadores = totalGanadores;
    }

    public String getLogoCompeticion() {
        return logoCompeticion;
    }

    public void setLogoCompeticion(String logoCompeticion) {
        this.logoCompeticion = logoCompeticion;
    }

    public List<Club> getClubes() {
        return clubes;
    }

    public void setClubes(List<Club> clubes) {
        this.clubes = clubes;
    }

    
    
}
