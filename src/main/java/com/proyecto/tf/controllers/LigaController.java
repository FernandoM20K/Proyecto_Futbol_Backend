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

import com.proyecto.tf.models.Liga;
import com.proyecto.tf.services.ILigaService;

@RestController
@RequestMapping("/ligas")
@CrossOrigin("*")
public class LigaController {
    
    @Autowired
    private ILigaService ligaService;

    @PostMapping("/")
    public ResponseEntity<Liga> agregarLiga(@RequestBody Liga liga) {
        return ResponseEntity.ok(ligaService.agregarLiga(liga));
    }

    @GetMapping("/")
    public ResponseEntity<?> obtenerLigas() {
        return ResponseEntity.ok(ligaService.obtenerLigas());
    }

    @GetMapping("/{ligaId}")
    public ResponseEntity<?> obtenerLigaPorId(@PathVariable("ligaId") Long ligaId) {
        return ResponseEntity.ok(ligaService.obtenerLigaPorId(ligaId));
    }

    @PutMapping("/")
    public ResponseEntity<?> actualizarLiga(@RequestBody Liga liga) {
        return ResponseEntity.ok(ligaService.actualizarLiga(liga));
    }

    @DeleteMapping("/{ligaId}")
    public void eliminarLiga(@PathVariable("ligaId") Long ligaId) {
        ligaService.eliminarLiga(ligaId);
    }
    
}
