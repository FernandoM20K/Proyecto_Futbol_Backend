package com.proyecto.tf.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.tf.models.Club;
import com.proyecto.tf.repositorys.IClubRepository;
import com.proyecto.tf.services.IClubService;

@Service
public class ClubServiceImpl implements IClubService {

    @Autowired 
    private IClubRepository clubRepository;

    @Override
    public Club agregarClub(Club club) {
        return clubRepository.save(club);
    }

    @Override
    public Club actualizarClub(Club club) {
        return clubRepository.save(club);
    }

    @Override
    public List<Club> obtenerClubes() {
        return clubRepository.findAll();
    }

    @Override
    public Club obtenerClubPorId(Long clubId) {
        return clubRepository.findById(clubId).get();
    }

    @Override
    public void eliminarClub(Long clubId) {
        Club club = obtenerClubPorId(clubId);
        if(club != null) {
            clubRepository.delete(club);
        }
    }
    
}
