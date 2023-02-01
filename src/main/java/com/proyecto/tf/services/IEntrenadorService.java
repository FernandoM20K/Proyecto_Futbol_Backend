package com.proyecto.tf.services;

import java.util.List;

import com.proyecto.tf.models.Entrenador;

public interface IEntrenadorService {
    Entrenador agregarEntrenador(Entrenador entrenador);
    Entrenador actualizarEntrenador(Entrenador entrenador);
    List<Entrenador> obtenerEntrenadores();
    Entrenador obtenerEntrenadorPorId(Long entrenadorId);
    void eliminarEntrenador(Long entrenadorId);
}
