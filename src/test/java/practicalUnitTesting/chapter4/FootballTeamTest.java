package practicalUnitTesting.chapter4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class FootballTeamTest {

	private static final int ANY_NUMBER = 123;

	public Object[] nbOfGamesWon() {
		return new Object[] { 0, 1, 2 };
	}

	@Test
	@Parameters(method = "nbOfGamesWon")
	public void constructorShouldSetGamesWon(int nbOfGamesWon) {
		FootballTeam team = new FootballTeam(nbOfGamesWon);
		assertEquals(nbOfGamesWon + " games passed to constructor, " + "but " + team.getGamesWon() + " were returned",
				nbOfGamesWon, team.getGamesWon());
	}

	public Object[] illegalNbOfGamesWon() {
		return new Object[] { -10, -1 };
	}

	@Test(expected = IllegalArgumentException.class)
	@Parameters(method = "illegalNbOfGamesWon")
	public void constructorShouldThrowExceptionForIllegalGamesNb(int illegalNbOfGames) {
		new FootballTeam(illegalNbOfGames);
	}

	@Test
	public void shouldBePossibleToCompareTeams() {
		FootballTeam team = new FootballTeam(ANY_NUMBER);
		assertTrue("FootballTeam should implement Comparable", team instanceof Comparable);
	}

	@Test
	public void teamsWithMoreMatchesWonShouldBeGreater() {
		FootballTeam team_2 = new FootballTeam(2);
		FootballTeam team_3 = new FootballTeam(3);
		assertTrue(team_3.compareTo(team_2) > 0);
	}

	@Test
	public void teamsWithLessMatchesWonShouldBeLesser() {
		FootballTeam team_2 = new FootballTeam(2);
		FootballTeam team_3 = new FootballTeam(3);
		assertTrue(team_2.compareTo(team_3) < 0);
	}
}