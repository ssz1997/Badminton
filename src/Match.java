
public class Match {
	
	Event event;
	Bracket bracket = Bracket.A;
	Player match[] = new Player[2];
	Player winner;
	Player loser;

	
	public Match(Player a, Player b, Event event) {
		match[0] = a;
		match[1] = b;
		this.event = event;
	}
	

	
	public int numberOfMostGamesPlayed(int number) {
	    int result = 1;
	    for (int i = 0; result <= number; i++) {
	    	    if (result == number) {
	    	    	    return i;
	    	    }
	    	    else {
	    	    	    result *= 2;
	    	    }
	    }
	    return -1;
	}
	
	public void win(Player winner, int first, int second, int third) {
		if (winner.bracket == Bracket.A) {
			
			if (winner.gamesPlayed == numberOfMostGamesPlayed(event.numberOfTeams) + 1) {
				event.championA = winner;
				if (winner == match[0]) {
					event.finalistA = match[1];
				}
				else {
					event.finalistA = match[0];
				}
			}
			else if (winner.gamesPlayed == 1) {
				this.winner = winner;
				if (winner == match[0]) { 

					loser = match[1];
					loser.bracket = Bracket.C;
					winner.matches[0][0] = first;
					winner.matches[0][1] = second;
					winner.matches[0][2] = third;
					loser.matches[0][0] = first;
					loser.matches[0][1] = second;
					loser.matches[0][2] = third;
					winner.gamesPlayed += 1;
					loser.gamesPlayed += 1;
				}
				else {
					
					loser = match[0];
					loser.bracket = Bracket.C;
					winner.matches[0][0] = first;
					winner.matches[0][1] = second;
					winner.matches[0][2] = third;
					loser.matches[0][0] = first;
					loser.matches[0][1] = second;
					loser.matches[0][2] = third;
					winner.gamesPlayed += 1;
					loser.gamesPlayed += 1;
				}
			}
			else if (winner.gamesPlayed == 2) {	
				
				this.winner = winner;
				if (winner == match[0]) {
					
					loser = match[1];
					loser.bracket = Bracket.B;
					winner.matches[0][0] = first;
					winner.matches[0][1] = second;
					winner.matches[0][2] = third;
					loser.matches[0][0] = first;
					loser.matches[0][1] = second;
					loser.matches[0][2] = third;
					winner.gamesPlayed += 1;
					loser.gamesPlayed += 1;
					
				}
				else {
					
					loser = match[0];
					loser.bracket = Bracket.B;
					winner.matches[0][0] = first;
					winner.matches[0][1] = second;
					winner.matches[0][2] = third;
					loser.matches[0][0] = first;
					loser.matches[0][1] = second;
					loser.matches[0][2] = third;
					winner.gamesPlayed += 1;
					loser.gamesPlayed += 1;
				}
			}
			else {
				this.winner = winner;
				if (winner == match[0]) {
					loser = match[1];
					loser.bracket = Bracket.E;
					winner.matches[0][0] = first;
					winner.matches[0][1] = second;
					winner.matches[0][2] = third;
					loser.matches[0][0] = first;
					loser.matches[0][1] = second;
					loser.matches[0][2] = third;
					winner.gamesPlayed += 1;
					loser.gamesPlayed += 1;
				}
				else {
					
					loser = match[0];
					loser.bracket = Bracket.E;
					winner.matches[0][0] = first;
					winner.matches[0][1] = second;
					winner.matches[0][2] = third;
					loser.matches[0][0] = first;
					loser.matches[0][1] = second;
					loser.matches[0][2] = third;
					winner.gamesPlayed += 1;
					loser.gamesPlayed += 1;
				}
			}
		}
		else if (winner.bracket == Bracket.B) {
			this.winner = winner;
			if (winner.gamesPlayed == numberOfMostGamesPlayed(event.numberOfTeams)) {
				event.championB = winner;
				if (winner == match[0]) {
					event.finalistB = match[1];
				}
				else {
					event.finalistB = match[0];
				}
			}
			else {
				if (winner == match[0]) {
					loser = match[1];
					loser.bracket = Bracket.E;
					winner.matches[0][0] = first;
					winner.matches[0][1] = second;
					winner.matches[0][2] = third;
					loser.matches[0][0] = first;
					loser.matches[0][1] = second;
					loser.matches[0][2] = third;
					winner.gamesPlayed += 1;
					loser.gamesPlayed += 1;
				}
				else {
					loser = match[0];
					loser.bracket = Bracket.E;
					winner.matches[0][0] = first;
					winner.matches[0][1] = second;
					winner.matches[0][2] = third;
					loser.matches[0][0] = first;
					loser.matches[0][1] = second;
					loser.matches[0][2] = third;
					winner.gamesPlayed += 1;
					loser.gamesPlayed += 1;
				}
			}
		}
		else if (winner.bracket == Bracket.C) {
			if (winner.gamesPlayed == numberOfMostGamesPlayed(event.numberOfTeams)) {
				event.championC = winner;
				if (winner == match[0]) {
					event.finalistC = match[1];
				}
				else {
					event.finalistC = match[0];
				}
			}
			else if (winner.gamesPlayed == 2) {
				this.winner = winner;
				if (winner == match[0]) {
					loser = match[1];
					loser.bracket = Bracket.B;
					winner.matches[0][0] = first;
					winner.matches[0][1] = second;
					winner.matches[0][2] = third;
					loser.matches[0][0] = first;
					loser.matches[0][1] = second;
					loser.matches[0][2] = third;
					winner.gamesPlayed += 1;
					loser.gamesPlayed += 1;
				}
				else {
					loser = match[0];
					loser.bracket = Bracket.B;
					winner.matches[0][0] = first;
					winner.matches[0][1] = second;
					winner.matches[0][2] = third;
					loser.matches[0][0] = first;
					loser.matches[0][1] = second;
					loser.matches[0][2] = third;
					winner.gamesPlayed += 1;
					loser.gamesPlayed += 1;
				}
			}
			else {
				this.winner = winner;
				
				if (winner == match[0]) {
					loser = match[1];
					loser.bracket = Bracket.E;
					winner.matches[0][0] = first;
					winner.matches[0][1] = second;
					winner.matches[0][2] = third;
					loser.matches[0][0] = first;
					loser.matches[0][1] = second;
					loser.matches[0][2] = third;
					winner.gamesPlayed += 1;
					loser.gamesPlayed += 1;
				}
				else {
					loser = match[0];
					loser.bracket = Bracket.E;
					winner.matches[0][0] = first;
					winner.matches[0][1] = second;
					winner.matches[0][2] = third;
					loser.matches[0][0] = first;
					loser.matches[0][1] = second;
					loser.matches[0][2] = third;
					winner.gamesPlayed += 1;
					loser.gamesPlayed += 1;
				}
			}
		}
		else {
			this.winner = winner;
			if (winner.gamesPlayed == numberOfMostGamesPlayed(event.numberOfTeams)) {
				event.championD = winner;
				if (winner == match[0]) {
					event.finalistD = match[1];
				}
				else {
					event.finalistD = match[0];
				}
			}
			else {
				if (winner == match[0]) {
					loser = match[1];
					loser.bracket = Bracket.E;
					winner.matches[0][0] = first;
					winner.matches[0][1] = second;
					winner.matches[0][2] = third;
					loser.matches[0][0] = first;
					loser.matches[0][1] = second;
					loser.matches[0][2] = third;
					winner.gamesPlayed += 1;
					loser.gamesPlayed += 1;
				}
				else {
					loser = match[0];
					loser.bracket = Bracket.E;
					winner.matches[0][0] = first;
					winner.matches[0][1] = second;
					winner.matches[0][2] = third;
					loser.matches[0][0] = first;
					loser.matches[0][1] = second;
					loser.matches[0][2] = third;
					winner.gamesPlayed += 1;
					loser.gamesPlayed += 1;
				}
			}
		}
	}
	
}
