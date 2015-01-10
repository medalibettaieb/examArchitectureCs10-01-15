package tn.edu.esprit.gl.ratRace.domain;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Owner
 * 
 */
@Entity
public class Owner extends User implements Serializable {

	private String secretToken;
	private static final long serialVersionUID = 1L;

	public Owner() {
		super();
	}

	public String getSecretToken() {
		return this.secretToken;
	}

	public void setSecretToken(String secretToken) {
		this.secretToken = secretToken;
	}

}
