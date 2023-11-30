package com.projetIntegration.pi.repository;

import com.projetIntegration.pi.model.etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EtudiantRepository extends JpaRepository <etudiant,Long> {
    //all crud database methods
}
