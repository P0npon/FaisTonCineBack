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
@Table(name = "Genre")
public class Genre implements Serializable {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idGenre")
	private Long idGenre;
	@Column(name = "genre", length = 200)
    private String genre;
   /* @OneToMany(fetch = FetchType.LAZY)
    private Set<Idee> idees ;
    */
    /*@OneToMany(fetch = FetchType.LAZY, mappedBy = "genre")
    private Set<ScenarioGenre> scenarioGenre  = new HashSet<ScenarioGenre>(0);
  */
    public Genre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Genre(String genre) {
		super();
		this.genre = genre;
	}
	

	public Long getIdGenre() {
		return idGenre;
	}
	public void setIdGenre(Long idGenre) {
		this.idGenre = idGenre;
	}

	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
 /*
	public Set<Idee> getIdees() {
		return idees;
	}
	public void setIdees(Set<Idee> idees) {
		this.idees = idees;
	}
   */

   


}