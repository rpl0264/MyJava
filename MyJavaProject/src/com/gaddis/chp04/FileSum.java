package com.gaddis.chp04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
   This program reads a series of numbers from a file and
   accumulates their sum.
*/

public class FileSum
{
   public static void main(String[] args) throws IOException
   {
      double sum;   // Accumulator
      String str;   // To hold a line read from the file

      // Open the file.
      FileReader freader = new FileReader("C:/murach/Gaddis/src/com/gaddis/chp04/Numbers.txt");
      BufferedReader inputFile = new BufferedReader(freader);

      // Initialize the accumulator.
      sum = 0.0;

      // Read the first line from the file.
      str = inputFile.readLine();

      // If the first line was successfully read,
      // convert it to a double and add it to the
      // accumulator. Then read the remaining numbers.
      while (str != null)
      {
         // Convert the String referenced by str
         // to a double and add it to sum.
         sum = sum + Double.parseDouble(str);
         
         // Read the next line from the file.
         str = inputFile.readLine();
      }

      // Close the file.
      inputFile.close();

      // Display the sum of the numbers.
      System.out.println("The sum of the numbers in " +
                         "Numbers.txt is " + sum);
   }
}
