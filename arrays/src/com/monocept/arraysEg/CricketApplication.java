package com.monocept.arraysEg;

import java.util.Scanner;

public class CricketApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		  
		  System.out.println("Let's Play Book Cricket\n\nEnter name of player1: ");
		  
		  String Player1 = scanner.nextLine();
		  System.out.println("Enter name of player2: ");
		  String Player2 = scanner.nextLine();
		  System.out.println("\n"+Player1+" starts playing: ");
		  
		  int totalScore = 0;
		  int playCounter = 0;
		  int Player1Score = 0, Player2Score = 0, Player1Turn = 0, Player2Turn = 0;
		  
		  while(playCounter < 2) {
		   
		   if(playCounter == 1) {
		    System.out.println("\n"+Player2+" starts playing: ");
		   }
		   
		   int turn = 1;
		   char ContinuePlaying = 'y'; 
		   
		   while(ContinuePlaying == 'y') {
		    
		    if(turn > 1) {
		     System.out.println("\nContinue playing? (y/n):");
		     ContinuePlaying = scanner.next().charAt(0);
		    }
		    
		    
		    if(ContinuePlaying == 'n') {
		     turn=1;
		     break;
		    }
		    
		    System.out.println("\nTURN " + turn);
		    turn++;
		    
		    int score = (int)(Math.random() * 300) + 1;
		    System.out.println("\nPage number generated : " + score);
		    System.out.println("\nScore : " + (score%7));
		    totalScore += (score%7);
		    
		    if((score%7)==0) {
		     System.out.println("Total score : " + totalScore);
		     break;
		    }
		    
		    System.out.println("Total score : " + totalScore);
		    if(turn>300) {
		     break;
		    }
		    
		   }
		   
		   if(playCounter==0) {
		    Player1Score = totalScore;
		    totalScore = 0;
		    Player1Turn = turn;
		    playCounter++;
		   }
		   
		   else if(playCounter==1){
		    Player2Score = totalScore;
		    totalScore = 0;
		    Player2Turn = turn;
		    playCounter++;
		   }
		  }
		  
		  if(Player1Score > Player2Score) {
		   System.out.println(Player1 + " is winner!");
		  }
		  
		  else if(Player1Score < Player2Score) {
		   System.out.println(Player2 + " is winner!");
		  }
		  
		  else {
		   if(Player1Turn < Player2Turn)
		    System.out.println(Player1 + " is winner!");
		   
		   else if(Player1Turn > Player2Turn) 
		    System.out.println(Player2 + " is winner!");
		   
		   else
		    System.out.println("It's a DRAW!");
		  }
		  
		        scanner.close();
		

	}

}
