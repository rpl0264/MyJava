/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaddis.chp04;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rl3457
 */
public class MathTutor4 {

    public static void main(String[] args) {
        int number1;      // A number
        int number2;      // Another number
        int sum;          // The sum of the numbers
        int userAnswer;   // The user's answer
        char cTest;
        String conTest;
        int ansWrong = 0;
        int ansRight = 0;


        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Create a Random class object.
        Random randomNumbers = new Random();


        do {



            // Get two random numbers.
            number1 = randomNumbers.nextInt(100);
            number2 = randomNumbers.nextInt(100);


            // Display an addition problem.
            System.out.println("What is the answer to the "
                    + "following problem?");
            System.out.print(number1 + " + "
                    + number2 + " = ? ");

            // Calculate the answer.
            sum = number1 + number2;

            // Get the user's answer.
            userAnswer = keyboard.nextInt();

            // Display the user's results.
            if (userAnswer == sum) {
                System.out.println("Correct!");
                
                //increment
                ansRight++;


            } else {
                System.out.println("Sorry, wrong answer. "
                        + "The correct answer is "
                        + sum);
                
                ansWrong++;
            }//end of else

            /*
             * NOTE: 'keyboard.nextLine()' needs to be added so that it will not
             * throw the following error: StringIndexOutOfBoundsException:
             * String index out of range: 0
             */
            //Consume the remaining newline.
            keyboard.nextLine();
            
            System.out.print("Correct Answers: " + ansRight + " " + "Wrong Answers: " + ansWrong + " ");

            System.out.print("Continue with Math Test? N to exit, Y to continue: ");

            conTest = keyboard.nextLine();
            cTest = conTest.charAt(0);

        } while (cTest == 'Y' || cTest == 'y'); //end of while

        System.out.println("Bye!!");

    }//end of main
}
