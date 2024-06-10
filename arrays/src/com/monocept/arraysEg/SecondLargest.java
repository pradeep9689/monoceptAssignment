package com.monocept.arraysEg;

import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Enter array size");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int result = getSecondLargest(array, n);
        if (result == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element: " + result);
        }
    }

    public static int getSecondLargest(int[] a, int n) {
        if (n < 2) {
           
            return Integer.MIN_VALUE;
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = a[i];
            } else if (a[i] > secondLargest && a[i] != firstLargest) {
                secondLargest = a[i];
            }
        }

        return secondLargest;
    }
}
