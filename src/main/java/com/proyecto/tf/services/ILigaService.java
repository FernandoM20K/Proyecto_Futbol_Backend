package com.proyecto.tf.services;

import java.util.List;

import com.proyecto.tf.models.Liga;

public interface ILigaService {
    Liga agregarLiga(Liga liga);
    Liga actualizarLiga(Liga liga);
    List<Liga> obtenerLigas();
    Liga obtenerLigaPorId(Long ligaId);
    void eliminarLiga(Long ligaId);
}
