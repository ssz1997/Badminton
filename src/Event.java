
public class Event {
	Match event[][] = new Match[4][];
	Match matchesA[];
	Match matchesB[];
	Match matchesC[];
	Match matchesD[];
	int numberOfTeams;
	Player championA;
	Player finalistA;
	Player championB;
	Player finalistB;
	Player championC;
	Player finalistC;
	Player championD;
	Player finalistD;
	Bracket bracket;
	Player playerList[];
	Player a;
	

	public Event(int numberOfTeams) {
		this.numberOfTeams = numberOfTeams;
		matchesA = new Match[numberOfTeams - 1];
		matchesB = new Match[numberOfTeams / 4 - 1];
		matchesC = new Match[numberOfTeams / 2 - 1];
		matchesD = new Match[numberOfTeams / 4 - 1];
		event[0] = matchesA;
		event[1] = matchesB;
		event[2] = matchesC;
		event[3] = matchesD;
		playerList = new Player[numberOfTeams];
	}
	
    public void win(String name, int first, int second, int third) { 

    	   for (int i = 0; i < playerList.length; i ++) {
    		   if (playerList[i].name.equals(name)) { 			   
    			   a = playerList[i];
    			   break;
    		   }
    	   }
    	   bracket = a.bracket;
    	   switch(bracket) {
    	   case A:{    
    		   for (int j = matchesA.length - 1; j >= 0; j --) {
    			   if (matchesA[j] != null) {
				   if (matchesA[j].match[0].name.equals(a.name) || matchesA[j].match[1].name.equals(a.name)){
					   matchesA[j].win(a, first, second, third);
					   if (0 <= j && j < (matchesA.length+1)/2) {
						   if (j % 2 == 0) {							   
							   if (matchesA[j+1].winner != null) {
								   matchesA[(matchesA.length+1)/2 + j/2] = new Match(matchesA[j].winner, matchesA[j+1].winner, this);
								   matchesC[j/2] = new Match(matchesA[j].loser, matchesA[j+1].loser, this);								   
							   }
						   }
						   else {
	
							   if (matchesA[j-1].winner != null) {
							       matchesA[(matchesA.length+1)/2 + j/2] = new Match(matchesA[j].winner, matchesA[j-1].winner, this);
							       matchesC[j/2] = new Match(matchesA[j].loser, matchesA[j-1].loser, this);							       
							   }
						   }
						   break;
					   }
					   else if ((matchesA.length+1)/2 <= j && j < (matchesA.length+1)/2 + (matchesA.length+1)/4) {
						   if (j % 2 == 0) {
							   if (matchesA[j+1].winner != null) {
								   matchesA[(matchesA.length+1)/2 + (matchesA.length+1)/4 + (j - (matchesA.length+1)/2)/2] = new Match(matchesA[j].winner, matchesA[j+1].winner, this);
								   matchesB[(j - (matchesA.length+1)/2)/2] = new Match(matchesA[j].loser, matchesA[j+1].loser, this);								   
							   }
						   }
						   else {
							   if (matchesA[j-1].winner != null) {
							       matchesA[(matchesA.length+1)/2 + (matchesA.length+1)/4 + (j - (matchesA.length+1)/2)/2] = new Match(matchesA[j].winner, matchesA[j-1].winner, this);
							       matchesB[(j - (matchesA.length+1)/2)/2] = new Match(matchesA[j].loser, matchesA[j-1].loser, this);							       
							   }
						   }
						   break;
					   }
					   else if((matchesA.length+1)/2 + (matchesA.length+1)/4 <= j && j < (matchesA.length+1)/2 + (matchesA.length+1)/4 + (matchesA.length+1)/8){
						   if (j % 2 == 0) {
							   if (matchesA[j+1].winner != null) {
								   matchesA[(matchesA.length+1)/2 + (matchesA.length+1)/4 + (j - (matchesA.length+1)/2)/2] = new Match(matchesA[j].winner, matchesA[j+1].winner, this);								   
							   }
						   }
						   else {
							   if (matchesA[j-1].winner != null) {
							       matchesA[(matchesA.length+1)/2 + (matchesA.length+1)/4 + (j - (matchesA.length+1)/2)/2] = new Match(matchesA[j].winner, matchesA[j-1].winner, this);  												       
							   }
						   }
						   break;
					   }
					   else if ((matchesA.length+1)/2 + (matchesA.length+1)/4 + (matchesA.length+1)/8 <= j && j < (matchesA.length+1)/2 + (matchesA.length+1)/4 + (matchesA.length+1)/8 + (matchesA.length+1)/16) {
						   if (j % 2 == 0) {
							   if (matchesA[j+1].winner != null) {
								   matchesA[(matchesA.length+1)/2 + (matchesA.length+1)/4 + (matchesA.length+1)/8 + (j - (matchesA.length+1)/2 - (matchesA.length+1)/4)/2] = new Match(matchesA[j].winner, matchesA[j+1].winner, this);								  
							   }
						   }
						   else {
							   if (matchesA[j-1].winner != null) {
								   matchesA[(matchesA.length+1)/2 + (matchesA.length+1)/4 + (matchesA.length+1)/8 + (j - (matchesA.length+1)/2 - (matchesA.length+1)/4)/2] = new Match(matchesA[j].winner, matchesA[j-1].winner, this);								  
							   }
						   }
						   break;
					   }
					   else {
						   break;
					   }				       
    				   }  					   
    			   }    			 
    		   }
    	   break;
    	   }
    	   case B:{
    		   loopB:
    		   for (int j = matchesB.length - 1; j >= 0; j--) {
    			   if (matchesB[j] != null) {
				   if (matchesB[j].match[0].name.equals(a.name) || matchesA[j].match[1].name.equals(a.name)){
					   matchesB[j].win(a, first, second, third);
					   if (0 <= j && j < (matchesB.length+1)/2) {
						   if (j % 2 == 0) {
							   if (matchesB[j+1].winner != null) {
								   matchesB[(matchesB.length+1)/2 + j/2] = new Match(matchesB[j].winner, matchesB[j+1].winner, this);								   
							   }
						   }
						   else {
							   if (matchesB[j-1].winner != null) {
							       matchesB[(matchesA.length+1)/2 + j/2] = new Match(matchesB[j].winner, matchesB[j-1].winner, this);							       
							   }
						   }
						   break loopB;
					   }
					   else if((matchesB.length+1)/2 <= j && j < (matchesB.length+1)/2 + (matchesB.length+1)/4) {
						   if (j % 2 == 0) {
							   if (matchesB[j+1].winner != null) {
								   matchesB[(matchesB.length+1)/2 + (matchesB.length+1)/4 + (j - (matchesB.length+1)/2)/2] = new Match(matchesB[j].winner, matchesB[j+1].winner, this);								   
							   }
						   }
						   else {
							   if (matchesB[j-1].winner != null) {
							       matchesB[(matchesB.length+1)/2 + (matchesB.length+1)/4 + (j - (matchesB.length+1)/2)/2] = new Match(matchesB[j].winner, matchesB[j-1].winner, this);							       
							   }
						   }
						   break loopB;
					   }
					   else {
						   break loopB;
					   }
			       }    
    		       }
    	       }
    	   break;
    	   }
    	   case C:{
    		   loopC:
    		   for (int j = matchesC.length - 1; j >= 0 ; j--) {
    			   if (matchesC[j] != null) {
				   if (matchesC[j].match[0].name.equals(a.name)|| matchesC[j].match[1].name.equals(a.name)) {
					   matchesC[j].win(a, first, second, third);
					   if (0 <= j && j < (matchesC.length+1)/2) {
						   if (j % 2 == 0) {
							   if (matchesC[j+1].winner != null) {
								   matchesC[(matchesC.length+1)/2 + j/2] = new Match(matchesC[j].winner, matchesC[j+1].winner, this);
								   matchesD[j/2] = new Match(matchesC[j].loser, matchesC[j+1].loser, this);								   
							   }
						   }
						   else {
							   if (matchesC[j-1].winner != null) {
							       matchesC[(matchesC.length+1)/2 + j/2] = new Match(matchesC[j].winner, matchesC[j-1].winner, this);
							       matchesD[j/2] = new Match(matchesC[j].loser, matchesC[j-1].loser, this);							       
							   }
						   }
						   break loopC;
					   }
					   else if ((matchesC.length+1)/2 <= j && j < (matchesC.length+1)/2 + (matchesC.length+1)/4) {
						   if (j % 2 == 0) {
							   if (matchesC[j+1].winner != null) {
								   matchesC[(matchesA.length+1)/2 + (matchesC.length+1)/4 + (j - (matchesC.length+1)/2)/2] = new Match(matchesC[j].winner, matchesC[j+1].winner, this);								   
							   }
						   }
						   else {
							   if (matchesC[j-1].winner != null) {
							       matchesC[(matchesC.length+1)/2 + (matchesC.length+1)/4 + (j - (matchesC.length+1)/2)/2] = new Match(matchesC[j].winner, matchesC[j-1].winner, this);							       
							   }
						   }
						   break loopC;
					   }
					   else if((matchesC.length+1)/2 + (matchesC.length+1)/4 <= j && j < (matchesC.length+1)/2 + (matchesC.length+1)/4 + (matchesC.length+1)/8){
						   if (j % 2 == 0) {
							   if (matchesC[j+1].winner != null) {
								   matchesC[(matchesC.length+1)/2 + (matchesC.length+1)/4 + (j - (matchesC.length+1)/2)/2] = new Match(matchesC[j].winner, matchesC[j+1].winner, this);								   
							   }
						   }
						   else {
							   if (matchesC[j-1].winner != null) {
							       matchesC[(matchesC.length+1)/2 + (matchesC.length+1)/4 + (j - (matchesC.length+1)/2)/2] = new Match(matchesC[j].winner, matchesC[j-1].winner, this);  												       
							   }
						   }
						   break loopC;
					   }
					   else {
						   break loopC;
					   }
				   }    				   
    			   }
    		   }
    	   break;
    	   }
    	   case D:{
    		   loopD:
    		   for (int j = matchesD.length - 1; j >= 0; j--) {
    			   if (matchesD[j] != null) {  		
				   if (matchesD[j].match[0].name.equals(a.name) || matchesD[j].match[1].name.equals(a.name)){
					   matchesD[j].win(a, first, second, third);
					   if (0 <= j && j < (matchesD.length+1)/2) {
						   if (j % 2 == 0) {
							   if (matchesD[j+1].winner != null) {
								   matchesD[(matchesD.length+1)/2 + j/2] = new Match(matchesD[j].winner, matchesD[j+1].winner, this);  
							   }
						   }
						   else {
							   if (matchesD[j-1].winner != null) {
							       matchesD[(matchesD.length+1)/2 + j/2] = new Match(matchesD[j].winner, matchesD[j-1].winner, this); 								       
							   }
						   }
						   break loopD;
					   }
					   else if((matchesD.length+1)/2 <= j && j < (matchesD.length+1)/2 + (matchesD.length+1)/4) {
						   if (j % 2 == 0) {
							   if (matchesD[j+1].winner != null) {
								   matchesD[(matchesD.length+1)/2 + (matchesD.length+1)/4 + (j - (matchesD.length+1)/2)/2] = new Match(matchesD[j].winner, matchesD[j+1].winner, this);  
							   }
						   }
						   else {
							   if (matchesD[j-1].winner != null) {
							       matchesD[(matchesD.length+1)/2 + (matchesD.length+1)/4 + (j - (matchesD.length+1)/2)/2] = new Match(matchesD[j].winner, matchesD[j-1].winner, this);   
							   }
						   }
						   break loopD;
					   }
					   else {
						   break loopD;
					   }
			       }    			       
    		       }
    	       }
    	   break;
       } 
    	   default:    		   
    	   }
    }
}   	    	