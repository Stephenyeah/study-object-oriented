package TicTacToeApp;

interface GirdLocations {
	
	
	public static void setgirdlocation(char[][]gameBoard,int girdlocation,player player) {
		char symbol = 'X';
		if(player.playername.equals("player1")) {
			symbol ='X';
			
			
		}else if (player.playername.equals("player2")) {
			symbol = 'O';
			player.player2Postions.add(girdlocation);
		}
		else if (player.playername.equals("cpu")) {
			symbol = 'O';
		}
		
		
		
		switch(girdlocation) {
			    case 7:
			 	   gameboard.gameBoard[0][0] = symbol;
			 	   break;
			    case 8:
			 	   gameboard.gameBoard[0][3] = symbol;
			 	   break;
			    case 9:
			 	   gameboard.gameBoard[0][6] = symbol;
			 	   break;
			    case 4:
			 	   gameboard.gameBoard[2][0] = symbol;
			 	   break;
			    case 5:
			 	   gameboard.gameBoard[2][3] = symbol;
			 	   break;
			    case 6:
			 	   gameboard.gameBoard[2][6] = symbol;
			 	   break;
			    case 1:
			 	   gameboard.gameBoard[4][0] = symbol;
			 	   break;
			    case 2:
			 	   gameboard.gameBoard[4][3] = symbol;
			 	   break;
			    case 3:
			 	   gameboard.gameBoard[4][6] = symbol;
			 	   break;
			 	default:
			 		break;
	}
	gameboard.printboard(gameboard.gameBoard);

		
	}
	
}
