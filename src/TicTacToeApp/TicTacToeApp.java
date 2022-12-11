package TicTacToeApp;
import java.util.Scanner;

import java.util.Random;

public class TicTacToeApp {
	

	
	
	public static void main(String[] args) {
		
		gameboard.printboard(gameboard.gameBoard);
		player player1 = new player("player1");
		player player2 = new player("player2");
		
		
		while(true){
			Scanner in = new Scanner(System.in);
			System.out.println("Type your placement (1-9):");
			//player1 enter
			int girdlocation = in.nextInt();
			//check the position have been taken?
			while(player1.player1Postions.contains(girdlocation)|| player2.player2Postions.contains(player1.player1Postions))
			{
			    System.out.println("Position taken! Eneter a correct Positon");
			    girdlocation =in.nextInt();
		
			}
			System.out.println(girdlocation);			
			GirdLocations.setgirdlocation(gameboard.gameBoard, girdlocation, player1);
			player1.player1Postions.add(girdlocation);
			//check the winner			
			String result = player1.checkWinner();
			if(result.length()>0) {
				System.out.println(result);
				break;
			}
				
			//player2 enter
			int girdlocation1 = in.nextInt();
			//check the position have been taken?
			while(player1.player1Postions.contains(girdlocation1)|| player1.player1Postions.contains(player2.player2Postions))
			{
			    System.out.println("Position taken! Eneter a correct Positon");
			    girdlocation1 =in.nextInt();
		
			}			
			GirdLocations.setgirdlocation(gameboard.gameBoard, girdlocation1, player2);
			player2.player2Postions.add(girdlocation1);
             //check the winner
			 result = player2.checkWinner();			
			if(result.length()>0) {
				System.out.println(result);
				break;
			}
//			Random rand = new Random();
//			int cpuLoction = rand.nextInt(9)+1;
//			GirdLocations.setgirdlocation(gameboard.gameBoard, cpuLoction, "cpu");
		}
		

		
	}
	
	
	

}

