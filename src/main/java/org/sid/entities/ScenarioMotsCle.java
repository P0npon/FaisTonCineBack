package org.sid.entities;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ScenarioMotsCle implements Serializable{
	private Long Id;
	private Scenario scenario;
	private MotsCle motsCle;
	
	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)	  
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idScenario", nullable = false)
	public Scenario getScenario() {
		return scenario;
	}
	public void setScenario(Scenario scenario) {
		this.scenario = scenario;
	}
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idMotsCle", nullable = false)
	public MotsCle getMotsCle() {
		return motsCle;
	}
	public void setMotsCle(MotsCle motsCle) {
		this.motsCle = motsCle;
	}
	
	
	

}
