package com.proyecto.tf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.tf.models.Entrenador;
import com.proyecto.tf.services.IEntrenadorService;

@RestController
@RequestMapping("/entrenador")
@CrossOrigin("*")
public class EntrenadorController {

    @Autowired
    private IEntrenadorService entrenadorService;

    @PostMapping("/")
    public ResponseEntity<Entrenador> guardarEntrenador(@RequestBody Entrenador entrenador) {
        return ResponseEntity.ok(entrenadorService.agregarEntrenador(entrenador));
    }

    @GetMapping("/")
    public ResponseEntity<?> obtenerEntrenadores() {
        return ResponseEntity.ok(entrenadorService.obtenerEntrenadores());
    }

    @GetMapping("/{entrenadorId}")
    public Entrenador obtenerEntrenadorPorId(@PathVariable("entrenadorId") Long entrenadorId) {
        return entrenadorService.obtenerEntrenadorPorId(entrenadorId);
    }

    @PutMapping("/")
    public Entrenador actualizarEntrenador(@RequestBody Entrenador entrenador) {
        return entrenadorService.actualizarEntrenador(entrenador);
    }

    @DeleteMapping("/{entrenadorId}")
    public void eliminarEntrenador(@PathVariable("entrenadorId") Long entrenadorId) {
        entrenadorService.eliminarEntrenador(entrenadorId);
    }
    
}
