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

import com.proyecto.tf.models.Estadio;
import com.proyecto.tf.services.IEstadioService;

@RestController
@RequestMapping("/estadios")
@CrossOrigin("*")
public class EstadioController {

    @Autowired
    private IEstadioService estadioService;

    @PostMapping("/")
    public ResponseEntity<Estadio> agregarEstadio(@RequestBody Estadio estadio) {
        return ResponseEntity.ok(estadioService.agregarEstadio(estadio));
    }

    @GetMapping("/")
    public ResponseEntity<?> obtenerEstadios() {
        return ResponseEntity.ok(estadioService.obtenerEstadios());
    }

    @GetMapping("/{estadioId}")
    public ResponseEntity<?> obtenerEstadioPorId(@PathVariable("estadioId") Long estadioId) {
        return ResponseEntity.ok(estadioService.obtenerEstadioPorId(estadioId));
    }

    @PutMapping("/")
    public ResponseEntity<?> actualizarEstadio(@RequestBody Estadio estadio) {
        return ResponseEntity.ok(estadioService.actualizarEstadio(estadio));
    }

    @DeleteMapping("/{estadioId}")
    public void eliminarEstadio(@PathVariable("estadioId") Long estadioId) {
        estadioService.eliminarEstadio(estadioId);
    }
    
}
