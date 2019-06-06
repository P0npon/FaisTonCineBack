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
import javax.persistence.ManyToOne;
import javax.persistence.Id;
@Entity
public class ProjetMotsCle implements Serializable {
	
	private Long Id;
	private Projet projet;
	private MotsCle motsCle;


	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	  public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idProjet", nullable = false)
	public Projet getProjet() {
		return projet;
	}
	public void setProjet(Projet projet) {
		this.projet = projet;
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
