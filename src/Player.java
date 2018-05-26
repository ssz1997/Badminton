
public class Player {
	String name;
	public Bracket bracket = Bracket.A;
	public int matches[][] = new int[5][3];
	public int gamesPlayed = 1;
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public void setBracket(Bracket bracket) {
		this.bracket = bracket;
	}
	
	
}
