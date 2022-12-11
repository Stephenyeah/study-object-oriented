package TicTacToeApp;

class gameboard {
  public static char[] [] gameBoard = {{' ',' ','|',' ',' ','|',' ',' '},
			{'-','-','+','-','-','+','-','-',' '},
			{' ',' ','|',' ',' ','|',' ',' '},
			{'-','-','+','-','-','+','-','-',' '},
			{' ',' ','|',' ',' ','|',' ',' '}};
	
	public gameboard() {
		gameBoard = this.gameBoard;
	}
	public void setgirdlocation(int number) {
		
		
	}
	
	
	public static void printboard(char[][]gameBoard) {
		
		
		
		for(char[] row : gameBoard){
			for(char c : row) {
				System.out.print(c);
			}
			System.out.println();
			
		}

	}
	
	

}
