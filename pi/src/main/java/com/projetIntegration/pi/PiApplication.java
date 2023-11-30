package com.projetIntegration.pi;

import com.projetIntegration.pi.model.etudiant;
import com.projetIntegration.pi.model.matiere;
import com.projetIntegration.pi.repository.EtudiantRepository;
import com.projetIntegration.pi.repository.MatiereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PiApplication  implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(PiApplication.class, args);
	}
@Autowired
private EtudiantRepository etudiantRepository;
	@Autowired
	private MatiereRepository matiereRepository;
	@Override
	public void run(String... args) throws Exception {
		etudiant etud = new etudiant();
		matiere  Matiere = new matiere();


	}
}
