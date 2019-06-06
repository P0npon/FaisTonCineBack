package org.sid.entities;


import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "MotsCle")
public class MotsCle implements Serializable{

	private Long idMotsCle;
    private String mCle;
    
    private Set<ScenarioMotsCle> ScenarioMotcles  = new HashSet<ScenarioMotsCle>(0);
    private Set<IdeeMotsCle> ideeMotcles  = new HashSet<IdeeMotsCle>(0);
    private Set<ProjetMotsCle> projetMotcles  = new HashSet<ProjetMotsCle>(0);
	
    public MotsCle() {
		super();
		// TODO Auto-generated constructor stub
	}
    

	public MotsCle(String mCle) {
		super();
		this.mCle = mCle;
	}




	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idMotsCle")
	public Long getIdMotsCle() {
		return idMotsCle;
	}
	public void setIdMotsCle(Long idMotsCle) {
		this.idMotsCle = idMotsCle;
	}
	public String getmCle() {
		return mCle;
	}

	public void setmCle(String mCle) {
		this.mCle = mCle;
	}
	
    @OneToMany(mappedBy = "motsCle",cascade = CascadeType.ALL)
	public Set<ProjetMotsCle> getProjetMotcles() {
		return projetMotcles;
	}

	public void setProjetMotcles(Set<ProjetMotsCle> projetMotcles) {
		this.projetMotcles = projetMotcles;
	}
	
    @OneToMany(mappedBy = "motsCle",cascade = CascadeType.ALL)
	public Set<ScenarioMotsCle> getScenarioMotcles() {
		return ScenarioMotcles;
	}

	public void setScenarioMotcles(Set<ScenarioMotsCle> scenarioMotcles) {
		ScenarioMotcles = scenarioMotcles;
	}
	
    @OneToMany(mappedBy = "motsCle")

	public Set<IdeeMotsCle> getIdeeMotcles() {
		return ideeMotcles;
	}

	public void setIdeeMotcles(Set<IdeeMotsCle> ideeMotcles) {
		this.ideeMotcles = ideeMotcles;
	}
	
	

}