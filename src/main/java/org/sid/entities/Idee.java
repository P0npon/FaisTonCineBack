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
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "Idee")
public class Idee implements Serializable {

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idIdee")
	private Long idIdee;
	@Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
	
	@Column(columnDefinition="varchar(20)")
    private String idee;
    private String titre;
	
    @ManyToOne@JoinColumn(name = "idGenre")
    private Genre genre;
    
   
    @ManyToOne@JoinColumn(name = "idTypeIdee")
    private TypeIdee typeIdee;
  
    // private Utilisateur utilisateur;
  
    @OneToMany(mappedBy = "idee")
    private Set<IdeeMotsCle> ideeMotcles ;
   
    /* @JsonIgnore @JsonManagedReference @OneToMany(mappedBy = "idee")
    private Set<IdeeCategorie> ideeCategories  = new HashSet<IdeeCategorie>(0);
    @JsonIgnore @JsonManagedReference@OneToMany(mappedBy = "idee")
    private Set<ProjetIdee> projetIdees  = new HashSet<ProjetIdee>(0);

*/
    public Idee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Idee(Date dateCreation, String idee, String titre) {
		super();
		this.dateCreation = dateCreation;
		this.idee = idee;
		this.titre = titre;
	}
	


	public Idee(Long idIdee, Date dateCreation, String idee, String titre, Genre genre, TypeIdee typeIdee,
			Set<IdeeMotsCle> ideeMotcles) {
		super();
		this.idIdee = idIdee;
		this.dateCreation = dateCreation;
		this.idee = idee;
		this.titre = titre;
		this.genre = genre;
		this.typeIdee = typeIdee;
		this.ideeMotcles = ideeMotcles;
	}
	public Long getIdIdee() {
		return idIdee;
	}
	public void setIdIdee(Long idIdee) {
		this.idIdee = idIdee;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	public String getIdee() {
		return idee;
	}
	public void setIdee(String idee) {
		this.idee = idee;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	
	
	public TypeIdee getTypeIdee() {
		return typeIdee;
	}
	public void setTypeIdee(TypeIdee typeIdee) {
		this.typeIdee = typeIdee;
	}
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "idUtilisateur", nullable = false)
	
//	public Utilisateur getUtilisateur() {
//		return utilisateur;
//	}
//
//	public void setUtilisateur(Utilisateur utilisateur) {
//		this.utilisateur = utilisateur;
//	}
	

 
	public Set<IdeeMotsCle> getIdeeMotcles() {
		return ideeMotcles;
	}
	public void setIdeeMotcles(Set<IdeeMotsCle> ideeMotcles) {
		this.ideeMotcles = ideeMotcles;
	}
	
	
	
	
/*
    
	public Set<IdeeCategorie> getIdeeCategories() {
		return ideeCategories;
	}

	public void setIdeeCategories(Set<IdeeCategorie> ideeCategories) {
		this.ideeCategories = ideeCategories;
	}
	
	

	public Set<ProjetIdee> getProjetIdees() {
		return projetIdees;
	}
	public void setProjetIdees(Set<ProjetIdee> projetIdees) {
		this.projetIdees = projetIdees;
	}
*/
}