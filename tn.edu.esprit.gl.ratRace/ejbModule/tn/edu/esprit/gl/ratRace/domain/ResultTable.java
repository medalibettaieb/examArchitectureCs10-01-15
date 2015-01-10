package tn.edu.esprit.gl.ratRace.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: ResultTable
 * 
 */
@Entity
public class ResultTable implements Serializable {

	private int rank;
	private ResultTableId resultTableId;
	private static final long serialVersionUID = 1L;

	private Race race;
	private Rat rat;

	public ResultTable() {
		super();
	}

	public int getRank() {
		return this.rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@EmbeddedId
	public ResultTableId getResultTableId() {
		return resultTableId;
	}

	public void setResultTableId(ResultTableId resultTableId) {
		this.resultTableId = resultTableId;
	}

	@ManyToOne
	@JoinColumn(name = "idRace", referencedColumnName = "id", updatable = false, insertable = false)
	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	@ManyToOne
	@JoinColumn(name = "idRat", referencedColumnName = "id", updatable = false, insertable = false)
	public Rat getRat() {
		return rat;
	}

	public void setRat(Rat rat) {
		this.rat = rat;
	}

}
