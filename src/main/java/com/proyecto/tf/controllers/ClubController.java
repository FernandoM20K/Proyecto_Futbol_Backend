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

import com.proyecto.tf.models.Club;
import com.proyecto.tf.services.IClubService;

@RestController
@RequestMapping("/club")
@CrossOrigin("*")
public class ClubController {

    @Autowired
    private IClubService clubService;

    @PostMapping("/")
    public ResponseEntity<Club> guardarClub(@RequestBody Club club) {
        return ResponseEntity.ok(clubService.agregarClub(club));
    }

    @GetMapping("/")
    public ResponseEntity<?> obtenerClubes() {
        return ResponseEntity.ok(clubService.obtenerClubes());
    }

    @GetMapping("/{clubId}")
    public Club obtenerClubPorId(@PathVariable("clubId") Long clubId) {
        return clubService.obtenerClubPorId(clubId);
    }

    @PutMapping("/")
    public ResponseEntity<Club> actualizarClub(@RequestBody Club club) {
        return ResponseEntity.ok(clubService.actualizarClub(club));
    }

    @DeleteMapping("/{clubId}")
    public void eliminarClub(@PathVariable("clubId") Long clubId) {
        clubService.eliminarClub(clubId);
    }
    
}
