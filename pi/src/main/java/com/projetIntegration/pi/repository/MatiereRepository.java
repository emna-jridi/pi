package com.projetIntegration.pi.repository;

import com.projetIntegration.pi.model.matiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface MatiereRepository extends JpaRepository<matiere, Long> {
    //all crud
}
