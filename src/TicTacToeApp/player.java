package TicTacToeApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class player {
      ArrayList<Integer> player1Postions = new ArrayList<Integer>();
      public void setPlayer1Postions(ArrayList<Integer> player1Postions) {
		this.player1Postions = player1Postions;
	}

	public void setPlayer2Postions(ArrayList<Integer> player2Postions) {
		this.player2Postions = player2Postions;
	}

	ArrayList<Integer> player2Postions = new ArrayList<Integer>();
	public String playername;
	public player() {
		
	
	}
	
	public player(String player) {
		playername = player;
	}
	
	public String checkWinner() {
		List topRow = Arrays.asList(1,2,3);
		List midRow = Arrays.asList(4,5,6);
		List bottomRow = Arrays.asList(7,8,9);
		List leftCol = Arrays.asList(1,4,7);
		List midCol = Arrays.asList(2,5,8);
		List rightRow = Arrays.asList(3,6,9);
		List cross1 = Arrays.asList(1,5,9);
		List cross2 = Arrays.asList(7,5,3);

		
		List<List> winning = new ArrayList<List>();
		winning.add(topRow);
		winning.add(midRow);
		winning.add(bottomRow);
		winning.add(leftCol);
		winning.add(midCol);
		winning.add(rightRow);
		winning.add(cross1);
		winning.add(cross2);
		
		
		
		int i;				
		for(List result :winning) {
			if(player1Postions.containsAll(result)){
				return "Congratualations player1 won! '0' ";			
			}else if(player2Postions.containsAll(result)) {
				return "Congratualations player2 won! (: ";				
		    }		 
		
	
		}
		if(player1Postions.size() == 5) {
			return "CAT TIE !!!";	
		}

				
		return "";
	}

}
