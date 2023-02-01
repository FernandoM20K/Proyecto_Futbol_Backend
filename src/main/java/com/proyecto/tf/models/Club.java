package com.proyecto.tf.models;

import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tb_clubes")
public class Club {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clubId;

    private String nombre;

    @Column(length = 1000)
    private String historia;
    
    private String fundador;
    private String propietario;

    @Temporal(TemporalType.DATE)
    private Calendar fechaFundacion;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estadioId")
    private Estadio estadio;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "entrenadorId")
    private Entrenador entrenadorActual;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ligaId")
    private Liga liga;

    private String imgEscudo;

    public Club() {
    
    }

    public Long getClubId() {
        return clubId;
    }

    public void setClubId(Long clubId) {
        this.clubId = clubId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getFundador() {
        return fundador;
    }

    public void setFundador(String fundador) {
        this.fundador = fundador;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Calendar getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(Calendar fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public Entrenador getEntrenadorActual() {
        return entrenadorActual;
    }

    public void setEntrenadorActual(Entrenador entrenadorActual) {
        this.entrenadorActual = entrenadorActual;
    }

    public String getImgEscudo() {
        return imgEscudo;
    }

    public void setImgEscudo(String imgEscudo) {
        this.imgEscudo = imgEscudo;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }
    
}
