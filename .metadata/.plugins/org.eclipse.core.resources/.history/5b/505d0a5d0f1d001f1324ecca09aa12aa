package com.monocept.object;

import java.util.Random;
import java.util.Scanner;

public class PigGame {
    
    private int winningScore;
    private int diceSides;
    private Scanner scanner;
    private Random random;
    private int totalScore;
    private int turnScore;
    private int turns;

    public PigGame() {
        winningScore = 20;
        diceSides = 6;
        scanner = new Scanner(System.in);
        random = new Random();
        totalScore = 0;
        turnScore = 0;
        turns = 0;
    }

    public void play() {
        System.out.println("Welcome to the PIG game!");
        
        while (true) {
            printStatus();
            String choice = getUserChoice();

            if (choice.equalsIgnoreCase("r")) {
                rollDice();
            }

            if (choice.equalsIgnoreCase("h")) {
                hold();
            }

            if (totalScore >= winningScore) {
                printWinMessage();
                break;
            }
        }

        scanner.close();
    }

    private void printStatus() {
        System.out.println("\nTurn: " + (turns + 1));
        System.out.println("Your total score: " + totalScore);
        System.out.println("Your turn score: " + turnScore);
        System.out.print("Do you want to roll or hold? (r/h): ");
    }

    private String getUserChoice() {
        return scanner.nextLine();
    }

    private void rollDice() {
        int roll = random.nextInt(diceSides) + 1;
        System.out.println("You rolled: " + roll);

        if (roll == 1) {
            turnScore = 0;
            turns++;
            System.out.println("Rolled a 1! Turn over. You lose all points for this turn.");
            return;
        }

        turnScore += roll;
        System.out.println("Your turn score is now: " + turnScore);
    }

    private void hold() {
        totalScore += turnScore;
        turnScore = 0;
        turns++;
        System.out.println("You chose to hold. Your total score is now: " + totalScore);
    }

    private void printWinMessage() {
        System.out.println("Congratulations! You've reached " + winningScore + " points and won the game!");
        System.out.println("It took you " + turns + " turns to reach " + winningScore + " points.");
    }

    public static void main(String[] args) {
        PigGame game = new PigGame();
        game.play();
    }
}
