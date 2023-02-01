package com.proyecto.tf.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.tf.models.Estadio;
import com.proyecto.tf.repositorys.IEstadioRepository;
import com.proyecto.tf.services.IEstadioService;

@Service
public class EstadioServiceImpl implements IEstadioService {

    @Autowired
    private IEstadioRepository estadioRepository;

    @Override
    public Estadio agregarEstadio(Estadio estadio) {
        return estadioRepository.save(estadio);
    }

    @Override
    public Estadio actualizarEstadio(Estadio estadio) {
        return estadioRepository.save(estadio);
    }

    @Override
    public List<Estadio> obtenerEstadios() {
        return estadioRepository.findAll();
    }

    @Override
    public Estadio obtenerEstadioPorId(Long estadioId) {
        return estadioRepository.findById(estadioId).get();
    }

    @Override
    public void eliminarEstadio(Long estadioId) {
        
    }
    
}
