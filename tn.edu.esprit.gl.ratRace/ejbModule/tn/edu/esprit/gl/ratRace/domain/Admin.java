package tn.edu.esprit.gl.ratRace.domain;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity

public class Admin extends User implements Serializable {

	
	private Integer accessLevel;
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}   
	public Integer getAccessLevel() {
		return this.accessLevel;
	}

	public void setAccessLevel(Integer accessLevel) {
		this.accessLevel = accessLevel;
	}
   
}
