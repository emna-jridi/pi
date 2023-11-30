package com.projetIntegration.pi.controller;

import com.projetIntegration.pi.exception.ResourceNotFoundException;
import com.projetIntegration.pi.model.matiere;
import com.projetIntegration.pi.repository.MatiereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/matiere")
public class MatiereController {

@Autowired
    private MatiereRepository matiereRepository;
//find all api
@GetMapping
    public List<matiere> getAllMatiere() {
        return matiereRepository.findAll();
    }

    //build creat  matiere bu restful api
    @PutMapping
    public matiere creatMatiere (@RequestBody matiere Matiere){
    return matiereRepository.save(Matiere) ;
}

// get matiere by id
@GetMapping("{id}")
    public ResponseEntity<matiere> getMatiereById( @PathVariable long id){
    matiere Matiere = matiereRepository.findById(id)
            .orElseThrow(()->new ResourceNotFoundException("la matiere n'existe pas"));
return  ResponseEntity.ok(Matiere);
}


//build update restful api
    @PutMapping("{id}")
    public  ResponseEntity<matiere> updateMatiere(@PathVariable long id , @RequestBody matiere matiere_details){
    matiere updateMat = matiereRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("la matiere n'exsite pas"));
    updateMat.setNom(matiere_details.getNom());
    updateMat.setProf(matiere_details.getProf());
    updateMat.setDuree(matiere_details.getDuree());
updateMat.setAnnee(matiere_details.getAnnee());
updateMat.setSemestre(matiere_details.getSemestre());
matiereRepository.save(updateMat);
return ResponseEntity.ok(updateMat);
    }
    @DeleteMapping("{id}")
    //build delete etudiant rest api
    public ResponseEntity<HttpStatus> deleteMatiere (@PathVariable long id){
    matiere Matiere = matiereRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Matiere does  not exist with id : " +id));
   matiereRepository.delete(Matiere);
   return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
