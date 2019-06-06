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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Categorie")
public class Categorie implements Serializable {

   

	private Long idCategorieIdee;
    private String categorieIdee;  
    private Set<ScenarioCategorie> scenarioCategorie  = new HashSet<ScenarioCategorie>(0);
    private Set<IdeeCategorie> ideeCategories  = new HashSet<IdeeCategorie>(0);

    public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categorie(String categorieIdee) {
		super();
		this.categorieIdee = categorieIdee;
	}

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCategorieIdee")
	public Long getIdCategorieIdee() {
		return idCategorieIdee;
	}
	public void setIdCategorieIdee(Long idCategorieIdee) {
		this.idCategorieIdee = idCategorieIdee;
	}
	public String getCategorieIdee() {
		return categorieIdee;
	}
	public void setCategorieIdee(String categorieIdee) {
		this.categorieIdee = categorieIdee;
	}
	
	  @OneToMany(mappedBy = "categorie", cascade = CascadeType.ALL)
		public Set<ScenarioCategorie> getScenarioCategorie() {
			return scenarioCategorie;
		}
		public void setScenarioCategorie(Set<ScenarioCategorie> scenarioCategorie) {
			this.scenarioCategorie = scenarioCategorie;
		}
	
	  @OneToMany(mappedBy = "categorie", cascade = CascadeType.ALL)
	public Set<IdeeCategorie> getIdeeCategories() {
		return ideeCategories;
	}

	public void setIdeeCategories(Set<IdeeCategorie> ideeCategories) {
		this.ideeCategories = ideeCategories;
	}

	



}