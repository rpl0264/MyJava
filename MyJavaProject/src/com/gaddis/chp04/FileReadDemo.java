package com.gaddis.chp04;

import java.util.Scanner; // Needed for the Scanner class
import java.io.*;         // Needed for file classes

/**
   This program reads data from a file.
*/

public class FileReadDemo
{
   public static void main(String[] args) throws IOException
   {
      String filename;    // File name
      String friendName;  // Friend's name

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the filename.
      //HINT: Enter the full path e.g. C:\murach\Gaddis\src\com\gaddis\chp04\MyFriends.txt
      System.out.print("Enter the filename: ");
      filename = keyboard.nextLine();

      // Open the file.
      FileReader freader = new FileReader(filename);
      BufferedReader inputFile = new BufferedReader(freader);

      // Read the first name from the file.
      friendName = inputFile.readLine();

      // If a name was read, display it and 
      // read the remaining names.
      while (friendName != null)
      {
         // Display the last name read.
         System.out.println(friendName);

         // Read the next name.
         friendName = inputFile.readLine();
      }

      // Close the file.
      inputFile.close();
   }
}
