package com.proyecto.tf.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.tf.models.Liga;

public interface ILigaRepository extends JpaRepository<Liga, Long>{
    
}
