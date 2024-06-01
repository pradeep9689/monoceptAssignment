package com.monocept.whilelooping;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int number = scanner.nextInt();
				int originalNumber, remainder,count=0; int result = 0;

        originalNumber = number;
       
        while (originalNumber != 0) {
           
        	originalNumber /= 10;
            ++count;
          }

         

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, count);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
	}

}
