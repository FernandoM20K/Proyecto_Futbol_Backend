package com.proyecto.tf.services;

import java.util.List;

import com.proyecto.tf.models.Estadio;

public interface IEstadioService {
    Estadio agregarEstadio(Estadio estadio);
    Estadio actualizarEstadio(Estadio estadio);
    List<Estadio> obtenerEstadios();
    Estadio obtenerEstadioPorId(Long estadioId);
    void eliminarEstadio(Long estadioId);
}
