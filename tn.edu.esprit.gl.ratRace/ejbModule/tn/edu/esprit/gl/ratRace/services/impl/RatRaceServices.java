package tn.edu.esprit.gl.ratRace.services.impl;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;

import tn.edu.esprit.gl.ratRace.domain.Bet;
import tn.edu.esprit.gl.ratRace.domain.Race;
import tn.edu.esprit.gl.ratRace.domain.Rat;
import tn.edu.esprit.gl.ratRace.domain.ResultTable;
import tn.edu.esprit.gl.ratRace.domain.User;
import tn.edu.esprit.gl.ratRace.services.interfaces.RatRaceServicesLocal;
import tn.edu.esprit.gl.ratRace.services.interfaces.RatRaceServicesRemote;

/**
 * Session Bean implementation class RatRaceServices
 */
@Stateless
public class RatRaceServices implements RatRaceServicesRemote,
		RatRaceServicesLocal {

	/**
	 * Default constructor.
	 */
	public RatRaceServices() {
	}

	@Override
	public User login(String login, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResultTable> findAllResultTables() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResultTable> findAllResultTablesByRaceId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addRat(Rat rat) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateRat(Rat rat) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteRat(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Rat findRatById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rat> findAllRats() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Race> findAllraces() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rat> findAllRatsByRaceId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createBet(User user, Race race, Rat rat, Date dateOfBet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean assignRatsToRace(Race race, List<Rat> rats) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addRace(Race race) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateBet(List<Bet> bets) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Rat findWinnerbyRaceId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createResultTable(Race race, Rat rat, int rank, Date date) {
		// TODO Auto-generated method stub
		return false;
	}

}
