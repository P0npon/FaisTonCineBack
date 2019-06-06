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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ProjetIdee implements Serializable {
	
	private Long Id;
	private Projet projet;
	private Idee idee;
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	  @JoinColumn(name = "idIdee", nullable = false)
	public Idee getIdee() {
		return idee;
	}
	public void setIdee(Idee idee) {
		this.idee = idee;
	}
	

}
