package org.sid.entities;

import java.io.Serializable;

public class IdeeMotsCleId implements Serializable{
	private Long idMotsCle;
	private Long idIdee;
	public Long getIdMotsCle() {
		return idMotsCle;
	}
	public void setIdMotsCle(Long idMotsCle) {
		this.idMotsCle = idMotsCle;
	}
	public Long getIdIdee() {
		return idIdee;
	}
	public void setIdIdee(Long idIdee) {
		this.idIdee = idIdee;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idIdee == null) ? 0 : idIdee.hashCode());
		result = prime * result + ((idMotsCle == null) ? 0 : idMotsCle.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IdeeMotsCleId other = (IdeeMotsCleId) obj;
		if (idIdee == null) {
			if (other.idIdee != null)
				return false;
		} else if (!idIdee.equals(other.idIdee))
			return false;
		if (idMotsCle == null) {
			if (other.idMotsCle != null)
				return false;
		} else if (!idMotsCle.equals(other.idMotsCle))
			return false;
		return true;
	}
	
	

}
