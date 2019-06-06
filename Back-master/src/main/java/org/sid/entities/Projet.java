package org.sid.entities;


import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "Projet")
public class Projet implements Serializable {
	
	

	private Long idProjet;
    private String titre;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    private String synopsys;
    private Scenario scenario;
    private Utilisateur utilisateur;
    
    private Set<ProjetMotsCle> ProjetMotcles  = new HashSet<ProjetMotsCle>(0);
    private Set<ProjetIdee> ProjetIdees  = new HashSet<ProjetIdee>(0);
    private Set<ProjetPersonnage> projetPersonnage  = new HashSet<ProjetPersonnage>(0);
    
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Projet(String titre, Date dateCreation, String synopsys) {
		super();
		this.titre = titre;
		this.dateCreation = dateCreation;
		this.synopsys = synopsys;
	}
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idIdee")
    public Long getIdProjet() {
		return idProjet;
	}
	public void setIdProjet(Long idProjet) {
		this.idProjet = idProjet;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getSynopsys() {
		return synopsys;
	}
	public void setSynopsys(String synopsys) {
		this.synopsys = synopsys;
	}
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idScenario")
	public Scenario getScenario() {
		return scenario;
	}
	public void setScenario(Scenario scenario) {
		this.scenario = scenario;
	}
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idUtilisateur")
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	   @OneToMany(mappedBy = "projet", cascade = CascadeType.ALL)
	public Set<ProjetMotsCle> getProjetMotcles() {
		return ProjetMotcles;
	}
	public void setProjetMotcles(Set<ProjetMotsCle> projetMotcles) {
		ProjetMotcles = projetMotcles;
	}
	   @OneToMany(mappedBy = "projet", cascade = CascadeType.ALL)
	public Set<ProjetIdee> getProjetIdees() {
		return ProjetIdees;
	}
	public void setProjetIdees(Set<ProjetIdee> projetIdees) {
		ProjetIdees = projetIdees;
	}
	   @OneToMany(mappedBy = "projet", cascade = CascadeType.ALL)
	public Set<ProjetPersonnage> getProjetPersonnage() {
		return projetPersonnage;
	}
	public void setProjetPersonnage(Set<ProjetPersonnage> projetPersonnage) {
		this.projetPersonnage = projetPersonnage;
	}


}