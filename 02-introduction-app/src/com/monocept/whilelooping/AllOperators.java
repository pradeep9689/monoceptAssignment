package com.monocept.whilelooping;
public class AllOperators {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 5;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Arithmetic Operators:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

       
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        
        boolean x = true;
        boolean y = false;

        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        System.out.println("!y: " + (!y));

       
        int c = 10;
        System.out.println("\nAssignment Operators:");
        System.out.println("c = " + c);
        c += 5;
        System.out.println("c += 5: " + c);
        c -= 5;
        System.out.println("c -= 5: " + c);
        c *= 2;
        System.out.println("c *= 2: " + c);
        c /= 2;
        System.out.println("c /= 2: " + c);
        c %= 3;
        System.out.println("c %= 3: " + c);

       
        int d = 5;
        System.out.println("\nIncrement and Decrement Operators:");
        System.out.println("d: " + d);
        System.out.println("d++: " + (d++)); 
        System.out.println("After d++: " + d);
        System.out.println("++d: " + (++d));
        System.out.println("After ++d: " + d);
        System.out.println("d--: " + (d--)); 
        System.out.println("After d--: " + d);
        System.out.println("--d: " + (--d)); 
        System.out.println("After --d: " + d);

        
        int age = 20;
        String result = (age >= 18) ? "You are an adult" : "You are not an adult";
       
        System.out.println(result);
        
        int number1 = 5; // 101 in binary
        int number2 = 3; // 011 in binary

        System.out.println("\nBitwise Operators:");
        System.out.println("c & d: " + (c & d)); 
        System.out.println("c | d: " + (c | d)); 
        System.out.println("c ^ d: " + (c ^ d)); 
        System.out.println("~c: " + (~c)); 
        System.out.println("c << 1: " + (c << 1)); 
        System.out.println("c >> 1: " + (c >> 1)); 
        System.out.println("c >>> 1: " + (c >>> 1)); 
    }
}
