package com.proyecto.tf.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.tf.models.Entrenador;
import com.proyecto.tf.repositorys.IEntrenadorRepository;
import com.proyecto.tf.services.IEntrenadorService;

@Service
public class EntrenadorServiceImpl implements IEntrenadorService {

    @Autowired
    private IEntrenadorRepository entrenadorRepository;

    @Override
    public Entrenador agregarEntrenador(Entrenador entrenador) {
        return entrenadorRepository.save(entrenador);
    }

    @Override
    public Entrenador actualizarEntrenador(Entrenador entrenador) {
        return entrenadorRepository.save(entrenador);
    }

    @Override
    public List<Entrenador> obtenerEntrenadores() {
        return entrenadorRepository.findAll();
    }

    @Override
    public Entrenador obtenerEntrenadorPorId(Long entrenadorId) {
        return entrenadorRepository.findById(entrenadorId).get();
    }

    @Override
    public void eliminarEntrenador(Long entrenadorId) {
        Entrenador entrenador = obtenerEntrenadorPorId(entrenadorId);
        if(entrenador != null) {
            entrenadorRepository.delete(entrenador);
        }
    }
    
}
