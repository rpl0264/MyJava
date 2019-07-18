package com.gaddis.chp08;

/**
   This program uses an invalid subscript with an array.
*/

public class InvalidSubscript
{
   public static void main(String[] args)
   {
      int[] values = new int[3];

      System.out.println("I will attempt to store four " +
                         "numbers in a three-element array.");
      
      
      //Change to 3 and it will work
      for (int index = 0; index < 4; index++)
      {
         System.out.println("Now processing element " + index);
         values[index] = 10;
      }
   }
}
