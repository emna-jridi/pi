package com.projetIntegration.pi.controller;

import com.projetIntegration.pi.exception.ResourceNotFoundException;
import com.projetIntegration.pi.model.etudiant;
import com.projetIntegration.pi.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/etudiant")
public class EtudiantController {

    @Autowired
    private EtudiantRepository etudiantRepository;
@GetMapping
    public List<etudiant> getAllEtudiant (){
return etudiantRepository.findAll();

    }
    // build creat etudiant rest api
    @PostMapping
    public etudiant creatEtudiant (@RequestBody etudiant etud){
return etudiantRepository.save(etud);
    }
    // build get etud by rest api
    @GetMapping("{id}")
    public ResponseEntity<etudiant> getEtudiantById(@PathVariable long id){
    etudiant etud = etudiantRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("l'etudiant avec cette id n'existe pas"));
    return ResponseEntity.ok(etud);
}

    // build update restful api
    @PutMapping("{id}")
    public ResponseEntity<etudiant> updateEtudiant (@PathVariable long id , @RequestBody etudiant etud_details){
    etudiant updateEtud = etudiantRepository.findById(id).orElseThrow( ()-> new ResourceNotFoundException("l'etudiant avec cette id n'existe pas"));
        updateEtud.setFirstName(etud_details.getFirstName());
        updateEtud.setLastName(etud_details.getLastName());
        updateEtud.setClasse(etud_details.getClasse());
        updateEtud.setCin(etud_details.getCin());
        updateEtud.setEmail(etud_details.getEmail());
        etudiantRepository.save(updateEtud);
        return ResponseEntity.ok(updateEtud);

    }

// build delete etudiant rest api
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteEtudiant (@PathVariable long id){
    etudiant etud  = etudiantRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("etudiant not exist with id : " +id));
    etudiantRepository.delete(etud);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
