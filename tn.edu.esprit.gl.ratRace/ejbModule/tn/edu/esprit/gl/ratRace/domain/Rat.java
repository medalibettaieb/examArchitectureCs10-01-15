package tn.edu.esprit.gl.ratRace.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Rat
 * 
 */
@Entity
public class Rat implements Serializable {

	private Integer id;
	private String name;
	private String color;
	private Float price;
	private boolean assigned;
	private static final long serialVersionUID = 1L;

	private User owner;
	private List<Bet> bets;
	private List<ResultTable> resultTables;

	public Rat() {
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Float getPrice() {
		return this.price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@ManyToOne
	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	@OneToMany(mappedBy = "rat")
	public List<Bet> getBets() {
		return bets;
	}

	public void setBets(List<Bet> bets) {
		this.bets = bets;
	}

	@OneToMany(mappedBy = "rat")
	public List<ResultTable> getResultTables() {
		return resultTables;
	}

	public void setResultTables(List<ResultTable> resultTables) {
		this.resultTables = resultTables;
	}

	public boolean isAssigned() {
		return assigned;
	}

	public void setAssigned(boolean assigned) {
		this.assigned = assigned;
	}

}
