package com.monocept.arraysEg;

import java.util.Random;
import java.util.Scanner;

public class PigGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to the PIG game!");
        System.out.println("Please enetr target score");
        int target=scanner.nextInt() ;
        int totalScore = 0;
        int turnScore = 0;
        int turns = 0;  
        boolean gameOn = true;

        
        		while (gameOn) {
            System.out.println("Turn: " + (turns + 1));
            System.out.println("Your total score: " + totalScore);
            System.out.println("Your turn score: " + turnScore);
            System.out.println("Do you want to roll or hold? (r/h)");

            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("r")) {
                int roll = random.nextInt(6) + 1;
                System.out.println("You rolled: " + roll);

                if (roll == 1) {
                    turnScore = 0;
                    turns++; 
                    System.out.println("Rolled a 1! Turn over. You lose all points for this turn.");
                } else {
                    turnScore += roll;
                    System.out.println("Your turn score is now: " + turnScore);
                }
            } else if (choice.equalsIgnoreCase("h")) {
                totalScore += turnScore;
                turnScore = 0;
                turns++;  
                System.out.println("You chose to hold. Your total score is now: " + totalScore);

                if (totalScore >= target) {
                    gameOn = false;
                    System.out.println("Congratulations! You've reached" +target+" points and won the game!");
                    System.out.println("It took you " + turns + " turns to reach" +target+" points.");
                }
            } else {
                System.out.println("Invalid input. Please type 'r' to roll or 'h' to hold.");
            }
        }

        scanner.close();

	}

}
