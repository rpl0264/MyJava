package com.gaddis.chp08;

import java.util.ArrayList;   // Needed for ArrayList class

/**
   This program demonstrates the ArrayList toString method.
*/

public class ArrayListDemo2
{
   public static void main(String[] args)
   {
      // Create a vector to hold some names.
      ArrayList nameList = new ArrayList();
      
      // Add some names to the ArrayList.
      nameList.add("James");
      nameList.add("Catherine");
      nameList.add("Bill");
      nameList.add("Harold");
      
      // Now display the items in nameList.
      System.out.println(nameList);
      
      nameList.remove(0);
      
      // Now display the items in nameList.
      System.out.println(nameList);
   }
}