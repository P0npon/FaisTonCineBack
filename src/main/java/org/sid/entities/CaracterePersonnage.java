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

@Entity
@Table(name = "CaracterePersonnage")
public class CaracterePersonnage  implements Serializable{

	
	private Long idCaracterePer;
    private String caractere;
    private Set<PersonnageCaractere> personnageCaractere  = new HashSet<PersonnageCaractere>(0);
    
    
    public CaracterePersonnage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CaracterePersonnage(String caractere) {
		super();
		this.caractere = caractere;
	}

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCaracterePer")
	public Long getIdCaracterePer() {
		return idCaracterePer;
	}

	public void setIdCaracterePer(Long idCaractereP) {
		this.idCaracterePer = idCaracterePer;
	}

	public String getCaractere() {
		return caractere;
	}

	public void setCaractere(String caractere) {
		this.caractere = caractere;
	}
	
    @OneToMany(mappedBy = "caracterPerssonnage",cascade = CascadeType.ALL)
	public Set<PersonnageCaractere> getPersonnageCaractere() {
		return personnageCaractere;
	}

	public void setPersonnageCaractere(Set<PersonnageCaractere> personnageCaractere) {
		this.personnageCaractere = personnageCaractere;
	}
 

}