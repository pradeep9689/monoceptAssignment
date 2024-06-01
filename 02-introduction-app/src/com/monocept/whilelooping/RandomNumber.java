package com.monocept.whilelooping;

import java.util.Random;

import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		
		
		guessing();
		Scanner scanner1=new Scanner(System.in);
		System.out.println("do you want play again\n yes/no");
		boolean again=scanner1.nextLine().equalsIgnoreCase("yes");
		if(again) {
			guessing();
		}
		else {
			System.out.println("Thank you");
			
		}
		
		
       

	}
	public static void guessing() {
		Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        System.out.println("random number"+numberToGuess);
        Scanner scanner = new Scanner(System.in);
        int guess;
        int i=0;
        int k=5;

        System.out.println("Welcome to the number guessing game!");
        System.out.println("Guess a number between 1 and 100:");

        while (i<5) {
            guess = scanner.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Congratulations, you guessed the number!");
                break;
            } else if (guess < numberToGuess) {
            
            	 System.out.println("Your guess is too low. Try again:");
            	 i++;
            } else {
                System.out.println("Your guess is too high. Try again:");
                i++;
            }
        }
        if (i == k) {
            System.out.println( "You have exhausted" + " 5 trials.");
 
            System.out.println( "The number was " +numberToGuess );
               
        }
	}

}