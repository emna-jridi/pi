package com.projetIntegration.pi;

import com.projetIntegration.pi.model.etudiant;
import com.projetIntegration.pi.repository.EtudiantRepository;
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
	@Override
	public void run(String... args) throws Exception {
		etudiant etud = new etudiant();
		etud.setFirstName("emna");
		etud.setLastName("jridi");
		etud.setCin("14508952");
		etud.setEmail("emna.jridi@esen.tn");
		etud.setNum_carte_etud(300);
		etud.setClasse("l3bis");

		etudiant etud1 = new etudiant();
		etud1.setFirstName("hichem");
		etud1.setLastName("jridi");
		etud1.setCin("14555952");
		etud1.setEmail("hichem.jridi@esen.tn");
		etud1.setNum_carte_etud(301);
		etud1.setClasse("l3bis");
	}
}
