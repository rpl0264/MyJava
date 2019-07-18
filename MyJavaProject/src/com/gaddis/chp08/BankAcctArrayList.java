package com.gaddis.chp08;

import java.util.ArrayList; // Needed for ArrayList class

/**
   This program demonstrates how to use a cast operator
   with the ArrayList class's get method.
*/

public class BankAcctArrayList
{
   public static void main(String[] args)
   {
      // Create an ArrayList to hold BankAccount objects.
      ArrayList list = new ArrayList();
      
      // Add BankAccount objects to the ArrayList.
      list.add(new BankAccount(100.0));
      list.add(new BankAccount(500.0));
      list.add(new BankAccount(1500.0));
       list.add(new BankAccount());
      
      // Display each item.
      for (int index = 0; index < list.size(); index++)
      {
         BankAccount account = (BankAccount)list.get(index);
         System.out.println("Account at index " + index +
                      "\nBalance: " + account.getBalance());
      }      
   }
}