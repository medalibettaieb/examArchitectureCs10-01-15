package tn.edu.esprit.gl.ratRace.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Bet
 * 
 */
@Entity
public class Bet implements Serializable {

	private Integer id;
	private Date dateOfBet;
	private Float betAmount;
	private Integer ticketOfficeNumber;
	private static final long serialVersionUID = 1L;

	private User user;
	private Race race;
	private Rat rat;

	public Bet() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateOfBet() {
		return this.dateOfBet;
	}

	public void setDateOfBet(Date dateOfBet) {
		this.dateOfBet = dateOfBet;
	}

	public Float getBetAmount() {
		return this.betAmount;
	}

	public void setBetAmount(Float betAmount) {
		this.betAmount = betAmount;
	}

	public Integer getTicketOfficeNumber() {
		return this.ticketOfficeNumber;
	}

	public void setTicketOfficeNumber(Integer ticketOfficeNumber) {
		this.ticketOfficeNumber = ticketOfficeNumber;
	}

	@ManyToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne
	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	@ManyToOne
	public Rat getRat() {
		return rat;
	}

	public void setRat(Rat rat) {
		this.rat = rat;
	}

}
