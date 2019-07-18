package com.gaddis.chp08;

/**
   This program demonstrates that two variables can
   reference the same array.
*/

public class SameArray
{
   public static void main(String[] args)
   {
      int[] array1 = { 2, 4, 6, 8, 10 };
      int[] array2 = array1;
      int[] array3 = array1;

      // Change one of the elements using array1.
      array1[0] = 203;

      // Change one of the elements using array2.
      array2[4] = 1000;
      
      // Change one of the elements using array2.
      array3[1] = 44;

      // Display all the elements using array1
      System.out.println("The contents of array1:");
      for (int index = 0; index < array1.length; index++)
         System.out.print(array1[index] + " ");
      System.out.println();

      // Display all the elements using array2
      System.out.println("The contents of array2:");
      for (int index = 0; index < array2.length; index++)
         System.out.print(array2[index] + " ");
      System.out.println();
      
      // Display all the elements using array3
      System.out.println("The contents of array3:");
      for (int index = 0; index < array3.length; index++)
         System.out.print(array3[index] + " ");
      System.out.println();
      
      
      
   }
}