package com.proyecto.tf.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.tf.models.Entrenador;

public interface IEntrenadorRepository extends JpaRepository<Entrenador, Long>{
    
}
