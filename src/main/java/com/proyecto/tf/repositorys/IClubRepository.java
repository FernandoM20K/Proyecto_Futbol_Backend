package com.proyecto.tf.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.tf.models.Club;

public interface IClubRepository extends JpaRepository<Club, Long>{
    
}
