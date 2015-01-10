package tn.edu.esprit.gl.ratRace.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Race
 * 
 */
@Entity
public class Race implements Serializable {

	private Integer id;
	private String place;
	private String type;
	private static final long serialVersionUID = 1L;

	private List<Bet> bets;
	private List<ResultTable> resultTables;

	public Race() {
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

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@OneToMany(mappedBy = "race")
	public List<Bet> getBets() {
		return bets;
	}

	public void setBets(List<Bet> bets) {
		this.bets = bets;
	}

	@OneToMany(mappedBy = "race")
	public List<ResultTable> getResultTables() {
		return resultTables;
	}

	public void setResultTables(List<ResultTable> resultTables) {
		this.resultTables = resultTables;
	}

}
