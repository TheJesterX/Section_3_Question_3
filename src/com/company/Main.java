// Jacobus Rothmann

package com.company;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // A integer list to contain all the number that are multiples of 3 or 5
        ArrayList<Integer> numberList = new ArrayList<>();
        // Allows for a easy change in the max number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the max number that should not be included");
        int max = sc.nextInt();
        for (int i = 1; i < max ; i++)
        {
            // Checks if the number value of i are multiples of either 3 or 5
            if ((i %3 == 0) || (i %5 == 0))
            {
                // If the number of i is a multiples of either 3 or 5 it is added to a list
                numberList.add(i);
            }
        }
        // Calculates the sum of the numberList
        int sumValue = numberList.stream().mapToInt(Integer::intValue).sum();
        // Display all the numbers that are multiples of 3 or 5 below 1000
        // System.out.println(numberList);
        // Display the sum results
        System.out.println(
                "The sum value of all natural number that are multiples of 3 or 5 below " + max + " : " + sumValue);
    }
}

