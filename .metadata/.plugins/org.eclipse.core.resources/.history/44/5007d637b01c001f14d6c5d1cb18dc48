package com.monocept.object;

import java.util.Random;
import java.util.Scanner;

public class PigGame {

    // Constants
    private static final int WINNING_SCORE = 20;
    private static final int DICE_SIDES = 6;
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private static int totalScore = 0;
    private static int turnScore = 0;
    private static int turns = 0;

    public static void main(String[] args) {
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

            if (totalScore >= WINNING_SCORE) {
                printWinMessage();
                break;
            }
        }

        scanner.close();
    }

    private static void printStatus() {
        System.out.println("\nTurn: " + (turns + 1));
        System.out.println("Your total score: " + totalScore);
        System.out.println("Your turn score: " + turnScore);
        System.out.print("Do you want to roll or hold? (r/h): ");
    }

    private static String getUserChoice() {
        return scanner.nextLine();
    }

    private static void rollDice() {
        int roll = random.nextInt(DICE_SIDES) + 1;
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

    private static void hold() {
        totalScore += turnScore;
        turnScore = 0;
        turns++;
        System.out.println("You chose to hold. Your total score is now: " + totalScore);
    }

    private static void printWinMessage() {
        System.out.println("Congratulations! You've reached " + WINNING_SCORE + " points and won the game!");
        System.out.println("It took you " + turns + " turns to reach " + WINNING_SCORE + " points.");
    }
}
