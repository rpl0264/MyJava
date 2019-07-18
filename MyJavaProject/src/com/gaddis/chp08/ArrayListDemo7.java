package com.gaddis.chp08;

//*******************************************************
// This program demonstrates how a ArrayList can hold a    *
// mixture of object types.                             *
//*******************************************************

import java.util.ArrayList;   // Needed for the ArrayList class

public class ArrayListDemo7
{
   public static void main(String[] args)
   {
      // Create an ArrayList to hold some different items.
      ArrayList list = new ArrayList();
      
      // Add a variety of objects to the ArrayList.
      list.add(new BankAccount(1500.0)); // Add BankAccount object
      list.add("Java is fun!");          // Add a String object
      list.add(new Rectangle(20, 10));   // Add a Rectangle object
      
      // Now get references to each of the objects
      // in the ArrayList. Note that the correct cast operator
      // is required for each statement.
      BankAccount item = (BankAccount)list.get(0);
      String str = (String)list.get(1);
      Rectangle rect = (Rectangle)list.get(2);
      
      //Print out the values
      System.out.println("Bank Balance: " + item.getBalance());
      System.out.println("String value: " + str);
      System.out.println("Rectangle Area: " + rect.getArea());
   }
}