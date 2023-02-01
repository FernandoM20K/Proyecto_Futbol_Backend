package com.proyecto.tf.services;

import java.util.List;

import com.proyecto.tf.models.Club;

public interface IClubService {
    Club agregarClub(Club club);
    Club actualizarClub(Club club);
    List<Club> obtenerClubes();
    Club obtenerClubPorId(Long clubId);
    void eliminarClub(Long clubId);
}
