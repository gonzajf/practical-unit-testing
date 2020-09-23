package practicalUnitTesting.chapter4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class FootballTeamTest {

	public Object[] nbOfGamesWon() {
		return new Object[] {0, 1, 2};
	}
	
	@Test
	@Parameters(method = "nbOfGamesWon")
	public void constructorShouldSetGamesWon(int nbOfGamesWon) {
		FootballTeam team = new FootballTeam(nbOfGamesWon);
		assertEquals(nbOfGamesWon + " games passed to constructor, " + "but " + team.getGamesWon() + " were returned",
				nbOfGamesWon, team.getGamesWon());
	}
}
