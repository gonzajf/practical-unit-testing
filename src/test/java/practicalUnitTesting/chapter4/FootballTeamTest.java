package practicalUnitTesting.chapter4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FootballTeamTest {

	@Test
	public void constructorShouldSetGamesWon() {
	
		FootballTeam team = new FootballTeam(3);
		assertEquals(3, team.getGamesWon());
	}

}
