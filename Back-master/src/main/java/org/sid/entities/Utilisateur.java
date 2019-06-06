package org.sid.entities;


import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Utilisateur")
public class Utilisateur implements Serializable{
  

	private Long idUtilisateur;
    private String nom;
    private String prenom;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    private char sexe;
    private String pseudo;
    private String motDePasse;
    private String email;
    private int age;
   // private Set<Idee> idees  = new HashSet<Idee>(0);
    private Set<Personnage> personnages  = new HashSet<Personnage>(0);
    private Set<Scenario> scenarios  = new HashSet<Scenario>(0);
    public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(String nom, String prenom, Date dateCreation, char sexe, String pseudo, String motDePasse,
			String email, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateCreation = dateCreation;
		this.sexe = sexe;
		this.pseudo = pseudo;
		this.motDePasse = motDePasse;
		this.email = email;
		this.age = age;
	}
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUtilisateur")
	public Long getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	@Column(name = "nom", length = 200)
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Column(name = "prenom", length = 200)
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
    @Temporal(TemporalType.TIMESTAMP)
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public char getSexe() {
		return sexe;
	}
	public void setSexe(char sexe) {
		this.sexe = sexe;
	}
	@Column(name = "pseudo", length = 200)
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	@Column(name = "motDePasse", length = 200)
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	@Column(name = "email", length = 200)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//    @OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL)
//	public Set<Idee> getIdees() {
//		return idees;
//	}
//	public void setIdees(Set<Idee> idees) {
//		this.idees = idees;
//	}
    @OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL)
	public Set<Personnage> getPersonnages() {
		return personnages;
	}
	public void setPersonnages(Set<Personnage> personnages) {
		this.personnages = personnages;
	}
    @OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL)
	public Set<Scenario> getScenarios() {
		return scenarios;
	}
	public void setScenarios(Set<Scenario> scenarios) {
		this.scenarios = scenarios;
	}


}