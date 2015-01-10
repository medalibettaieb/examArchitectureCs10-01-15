package tn.edu.esprit.gl.ratRace.domain;

import java.io.Serializable;
import java.lang.Float;
import javax.persistence.*;
import tn.edu.esprit.gl.ratRace.domain.User;

/**
 * Entity implementation class for Entity: Bettor
 *
 */
@Entity

public class Bettor extends User implements Serializable {

	
	private Float moneyCash;
	private static final long serialVersionUID = 1L;

	public Bettor() {
		super();
	}   
	public Float getMoneyCash() {
		return this.moneyCash;
	}

	public void setMoneyCash(Float moneyCash) {
		this.moneyCash = moneyCash;
	}
   
}
