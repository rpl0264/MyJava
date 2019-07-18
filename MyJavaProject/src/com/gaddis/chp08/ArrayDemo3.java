package com.gaddis.chp08;

import java.util.Scanner;   // Needed for Scanner class

/**
 * This program shows values being stored in an array's elements and displayed.The number of employees is dynamically set.
 */
public class ArrayDemo3 {

    public static void main(String[] args) {
        int EMPLOYEES = 0;           // Number of employees


        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of employees:");
        
        //Initialize the number of employees
        EMPLOYEES = keyboard.nextInt();
        
        //Set the number of employees
        int[] hours = new int[EMPLOYEES];  // Array of hours
        
        System.out.println("Enter the hours worked by "
                + EMPLOYEES + " employees.");

        //Enter the number of hours per employee
        for (int index = 0; index < EMPLOYEES; index++) {
            System.out.print("Employee " + index + ": ");
            hours[index] = keyboard.nextInt();

        }


        // Display the values entered.
        System.out.println("The hours you entered are:");
        // Display the values entered.
        for (int index = 0; index < EMPLOYEES; index++) {
            System.out.println("Employee " + index + ": " + hours[index]);
        }
    }
}
