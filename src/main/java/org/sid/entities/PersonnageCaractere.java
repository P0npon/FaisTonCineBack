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
public class PersonnageCaractere implements Serializable{
	//@EmbeddedId
	private Long Id;
	private Personnage personnage;
	private CaracterePersonnage caracterPerssonnage;
	
//	@AttributeOverrides({
//		@AttributeOverride(name = "idPersonnage", column = @Column(name = "idPersonnage", nullable = false)),
//		@AttributeOverride(name = "idcaracterPerssonnage", column = @Column(name = "idcaracterPerssonnage", nullable = false)) })
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	  public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	
	@ManyToOne(cascade = CascadeType.ALL) @JoinColumn(name = "idProjet", nullable = false)
	public Personnage getPersonnage() {
		return personnage;
	}
	public void setPersonnage(Personnage personnage) {
		this.personnage = personnage;
	}
	@ManyToOne(cascade = CascadeType.ALL) @JoinColumn(name = "idcaracterPerssonnage", nullable = false)
	public CaracterePersonnage getCaracterPerssonnage() {
		return caracterPerssonnage;
	}
	public void setCaracterPerssonnage(CaracterePersonnage caracterPerssonnage) {
		this.caracterPerssonnage = caracterPerssonnage;
	}

}
