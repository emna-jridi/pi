package com.projetIntegration.pi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="matiere")
public class matiere {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id_matiere;

@Column  ( name = "nom")
private String nom ;

@Column(name = "duree")
private int duree ;

@Column(name="semestre")
 private int semestre ;

@Column(name = "prof")
 private String prof ;

@Column(name = "annee")
 private  int annee ;
}
