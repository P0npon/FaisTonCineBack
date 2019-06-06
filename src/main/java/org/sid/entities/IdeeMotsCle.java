package org.sid.entities;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "IdeeMotsCle")
public class IdeeMotsCle implements Serializable{
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idIdeeMotsCle", unique = true, nullable = false)
	private Long idIdeeMotsCle;
	private IdeeMotsCleId id ;
	@ManyToOne@JoinColumn(name = "idee")
	private Idee idee;
	@ManyToOne@JoinColumn(name = "motsCle")
	private MotsCle motsCle;
	
	
	
	public IdeeMotsCle() {
	}
	
	
	
	
public Long getIdIdeeMotsCle() {
		return idIdeeMotsCle;
	}




	public void setIdIdeeMotsCle(Long idIdeeMotsCle) {
		this.idIdeeMotsCle = idIdeeMotsCle;
	}




@EmbeddedId
	
	@AttributeOverrides({
			@AttributeOverride(name = "idMotsCle", column = @Column(name = "idMotsCle")),
			@AttributeOverride(name = "idIdee", column = @Column(name = "idIdee"))})
	
	public IdeeMotsCleId getId() {
		return id;
	}
	public void setId(IdeeMotsCleId id) {
		this.id = id;
	}
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idIdee", nullable = false, insertable = false, updatable = false)
	public Idee getIdee() {
		return idee;
	}
	public void setIdee(Idee idee) {
		this.idee = idee;
	}
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idMotsCle", nullable = false, insertable = false, updatable = false)
	public MotsCle getMotsCle() {
		return motsCle;
	}
	public void setMotsCle(MotsCle motsCle) {
		this.motsCle = motsCle;
	}

}
