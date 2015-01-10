package tn.edu.esprit.gl.ratRace.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class ResultTableId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idRace;
	private Integer idRat;
	private Date dateOfBet;

	public ResultTableId() {
	}

	public ResultTableId(Integer idRace, Integer idRat, Date dateOfBet) {
		super();
		this.idRace = idRace;
		this.idRat = idRat;
		this.dateOfBet = dateOfBet;
	}

	public Integer getIdRace() {
		return idRace;
	}

	public void setIdRace(Integer idRace) {
		this.idRace = idRace;
	}

	public Integer getIdRat() {
		return idRat;
	}

	public void setIdRat(Integer idRat) {
		this.idRat = idRat;
	}

	public Date getDateOfBet() {
		return dateOfBet;
	}

	public void setDateOfBet(Date dateOfBet) {
		this.dateOfBet = dateOfBet;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateOfBet == null) ? 0 : dateOfBet.hashCode());
		result = prime * result + ((idRace == null) ? 0 : idRace.hashCode());
		result = prime * result + ((idRat == null) ? 0 : idRat.hashCode());
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
		ResultTableId other = (ResultTableId) obj;
		if (dateOfBet == null) {
			if (other.dateOfBet != null)
				return false;
		} else if (!dateOfBet.equals(other.dateOfBet))
			return false;
		if (idRace == null) {
			if (other.idRace != null)
				return false;
		} else if (!idRace.equals(other.idRace))
			return false;
		if (idRat == null) {
			if (other.idRat != null)
				return false;
		} else if (!idRat.equals(other.idRat))
			return false;
		return true;
	}

}
