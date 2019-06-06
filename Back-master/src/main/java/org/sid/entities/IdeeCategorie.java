package org.sid.entities;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "IdeeCategorie")
public class IdeeCategorie implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idIdee", nullable = false)
	private Idee idee;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idCategorieIdee", nullable = false)
	private Categorie categorie;

	
//	@AttributeOverrides({
//			@AttributeOverride(name = "idIdee", column = @Column(name = "idIdee", nullable = false)),
//			@AttributeOverride(name = "idCategorieIdee", column = @Column(name = "idCategorieIdee", nullable = false)) })


	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}


	public Idee getIdee() {
		return idee;
	}
	public void setIdee(Idee idee) {
		this.idee = idee;
	}
	

	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	
	

}
