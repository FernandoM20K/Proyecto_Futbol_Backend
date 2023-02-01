package com.proyecto.tf.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.tf.models.Estadio;

public interface IEstadioRepository extends JpaRepository<Estadio, Long> {
    
}
