package org.sid.entities;


import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Personnage")
public class Personnage implements Serializable{

	private Long idPersonnage;
    private String nom;
    private String prenom;
    private String surnom;
    private int age;
    private char sexe;
    private String biographie;
    private Utilisateur utilisateur;


    private Set<PersonnageCaractere> personnageCaracter  = new HashSet<PersonnageCaractere>(0);
    private Set<ProjetPersonnage> projetPersonnage  = new HashSet<ProjetPersonnage>(0);
    
    public Personnage() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPersonnage")
	public Long getIdPersonnage() {
		return idPersonnage;
	}
	public void setIdPersonnage(Long idPersonnage) {
		this.idPersonnage = idPersonnage;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getSurnom() {
		return surnom;
	}
	public void setSurnom(String surnom) {
		this.surnom = surnom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSexe() {
		return sexe;
	}
	public void setSexe(char sexe) {
		this.sexe = sexe;
	}
	public String getBiographie() {
		return biographie;
	}
	public void setBiographie(String biographie) {
		this.biographie = biographie;
	}
	  @OneToMany(mappedBy = "personnage", cascade = CascadeType.ALL)
	public Set<PersonnageCaractere> getPersonnageCaracter() {
		return personnageCaracter;
	}

	public void setPersonnageCaracter(Set<PersonnageCaractere> personnageCaracter) {
		this.personnageCaracter = personnageCaracter;
	}
	  @OneToMany(mappedBy = "personnage", cascade = CascadeType.ALL)
	public Set<ProjetPersonnage> getProjetPersonnage() {
		return projetPersonnage;
	}

	public void setProjetPersonnage(Set<ProjetPersonnage> projetPersonnage) {
		this.projetPersonnage = projetPersonnage;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idUtilisateur", nullable = false)
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	


}