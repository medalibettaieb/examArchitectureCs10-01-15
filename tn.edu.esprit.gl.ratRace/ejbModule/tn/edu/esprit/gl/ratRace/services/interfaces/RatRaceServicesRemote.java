package tn.edu.esprit.gl.ratRace.services.interfaces;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;

import tn.edu.esprit.gl.ratRace.domain.Bet;
import tn.edu.esprit.gl.ratRace.domain.Race;
import tn.edu.esprit.gl.ratRace.domain.Rat;
import tn.edu.esprit.gl.ratRace.domain.ResultTable;
import tn.edu.esprit.gl.ratRace.domain.User;

@Remote
public interface RatRaceServicesRemote {
	User login(String login, String password);

	List<ResultTable> findAllResultTables();

	List<ResultTable> findAllResultTablesByRaceId(Integer id);

	Rat findWinnerbyRaceId(Integer id);

	boolean addRat(Rat rat);

	boolean updateRat(Rat rat);

	boolean deleteRat(Integer id);

	Rat findRatById(Integer id);

	List<Rat> findAllRats();

	List<Race> findAllraces();

	List<Rat> findAllRatsByRaceId(Integer id);

	boolean createBet(User user, Race race, Rat rat, Date dateOfBet);

	boolean assignRatsToRace(Race race, List<Rat> rats);

	boolean addUser(User user);

	boolean addRace(Race race);

	boolean validateBet(List<Bet> bets);

	boolean createResultTable(Race race, Rat rat, int rank, Date date);
}
