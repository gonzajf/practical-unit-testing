package practicalUnitTesting.chapter4;

public class FootballTeam {

	private int gamesWon;

	public FootballTeam(int gamesWon) {
		if (gamesWon < 0) {
			throw new IllegalArgumentException("illegal gamesWon: [" + gamesWon + "]");
		}
		this.gamesWon = gamesWon;
	}

	public int getGamesWon() {
		return gamesWon;
	}
}