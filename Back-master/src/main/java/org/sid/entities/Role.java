package org.sid.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Role")

public class Role implements Serializable {


	private Long idRole;
    private String role;
    
    public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(String role) {
		super();
		this.role = role;
	}
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idRole")
	public Long getIdRole() {
		return idRole;
	}
	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}


}