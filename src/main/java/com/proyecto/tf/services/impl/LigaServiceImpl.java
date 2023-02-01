package com.proyecto.tf.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.tf.models.Liga;
import com.proyecto.tf.repositorys.ILigaRepository;
import com.proyecto.tf.services.ILigaService;

@Service
public class LigaServiceImpl implements ILigaService {

    @Autowired
    private ILigaRepository ligaRepository;

    @Override
    public Liga agregarLiga(Liga liga) {
        return ligaRepository.save(liga);
    }

    @Override
    public Liga actualizarLiga(Liga liga) {
        return ligaRepository.save(liga);
    }

    @Override
    public List<Liga> obtenerLigas() {
        return ligaRepository.findAll();
    }

    @Override
    public Liga obtenerLigaPorId(Long ligaId) {
        return ligaRepository.findById(ligaId).get();
    }

    @Override
    public void eliminarLiga(Long ligaId) {
        Liga liga = obtenerLigaPorId(ligaId);
        if (liga != null) {
            ligaRepository.delete(liga);
        }
    }
    
}
