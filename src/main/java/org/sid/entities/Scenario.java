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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "Scenario")
public class Scenario implements Serializable{
   
	

	private Long idScenario;
    private String titre;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    private String synopsys;
    private Utilisateur utilisateur;
    private Set<Projet> projets  = new HashSet<Projet>(0);
    private Set<ScenarioGenre> scenarioGenre  = new HashSet<ScenarioGenre>(0);
    private Set<ScenarioCategorie> scenarioCategorie  = new HashSet<ScenarioCategorie>(0);
    private Set<ScenarioMotsCle> scenarioMotsCle  = new HashSet<ScenarioMotsCle>(0);
    
    
    public Scenario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Scenario(String titre, Date dateCreation, String synopsys) {
		super();
		this.titre = titre;
		this.dateCreation = dateCreation;
		this.synopsys = synopsys;
	}
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idScenario")
	public Long getIdScenario() {
		return idScenario;
	}
	public void setIdScenario(Long idScenario) {
		this.idScenario = idScenario;
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
	
	@OneToMany(mappedBy = "scenario",cascade = CascadeType.ALL)
	public Set<Projet> getProjets() {
		return projets;
	}
	public void setProjets(Set<Projet> projets) {
		this.projets = projets;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idUtilisateur", nullable = false)
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@OneToMany(mappedBy = "scenario",cascade = CascadeType.ALL)
	public Set<ScenarioGenre> getScenarioGenre() {
		return scenarioGenre;
	}
	public void setScenarioGenre(Set<ScenarioGenre> scenarioGenres) {
		this.scenarioGenre = scenarioGenres;
	}
	

	@OneToMany(mappedBy = "scenario",cascade = CascadeType.ALL)
	public Set<ScenarioCategorie> getScenarioCategorie() {
		return scenarioCategorie;
	}
	public void setScenarioCategorie(Set<ScenarioCategorie> scenarioCategorie) {
		this.scenarioCategorie = scenarioCategorie;
	}
	
	@OneToMany(mappedBy = "scenario",cascade = CascadeType.ALL)
	public Set<ScenarioMotsCle> getScenarioMotsCle() {
		return scenarioMotsCle;
	}
	public void setScenarioMotsCle(Set<ScenarioMotsCle> scenarioMotsCle) {
		this.scenarioMotsCle = scenarioMotsCle;
	}

	



}