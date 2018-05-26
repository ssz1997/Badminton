import java.io.*;

public class Tournament {
	public Event MS = new Event(32);
	public Event WS = new Event(16);
	public Event MD = new Event(32);
	public Event WD = new Event(16);
	public Event XD = new Event(32);
	
	
	public Player[] createPlayerList(Event event, String filename) {
		int i = 0;
		File file = new File(filename);
		String line;
		FileReader fileReader;
		
		try {
			fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while((line = bufferedReader.readLine()) != null) {
				event.playerList[i] = new Player(line);
				i += 1;
			}
			
			fileReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return event.playerList;  
	}
	
	
	
	public void addFirstRound(Event event, Player[] playerList) {
		for (int i = 0; i < (event.matchesA.length + 1)/2; i ++) {
		    event.matchesA[i] = new Match(playerList[2*i], playerList[2*i+1], MS);
		}
	}
	
	
	
	public static void main(String [] args) throws Exception {
		
		    Tournament tournament = new Tournament();
		    tournament.MS.playerList = tournament.createPlayerList(tournament.MS, "MSPlayerList.txt");
		    tournament.addFirstRound(tournament.MS, tournament.MS.playerList);
		    tournament.WS.playerList = tournament.createPlayerList(tournament.WS, "WSPlayerList.txt");
		    tournament.addFirstRound(tournament.WS, tournament.WS.playerList);
		    tournament.WD.playerList = tournament.createPlayerList(tournament.WD, "WDPlayerList.txt");
		    tournament.addFirstRound(tournament.WD, tournament.WD.playerList);
		    tournament.XD.playerList = tournament.createPlayerList(tournament.XD, "XDPlayerList.txt");
		    tournament.addFirstRound(tournament.XD, tournament.XD.playerList);
		    tournament.MD.playerList = tournament.createPlayerList(tournament.MD, "MDPlayerList.txt");
		    tournament.addFirstRound(tournament.MD, tournament.MD.playerList);
		    
		    
		    
		    
	 }
}
