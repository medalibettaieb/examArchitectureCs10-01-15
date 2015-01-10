package tn.edu.esprit.gl.ratRace.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: User
 * 
 */
@Entity
public class User implements Serializable {

	private Integer id;
	private String name;
	private String login;
	private String password;
	private static final long serialVersionUID = 1L;

	private List<Rat> rats;
	private List<Bet> bets;

	public User() {
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@OneToMany(mappedBy = "owner")
	public List<Rat> getRats() {
		return rats;
	}

	public void setRats(List<Rat> rats) {
		this.rats = rats;
	}

	@OneToMany(mappedBy = "user")
	public List<Bet> getBets() {
		return bets;
	}

	public void setBets(List<Bet> bets) {
		this.bets = bets;
	}

}
