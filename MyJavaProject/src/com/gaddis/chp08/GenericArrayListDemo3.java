package com.gaddis.chp08;

import java.util.ArrayList; // Needed for ArrayList class

/**
	This program demonstrates how an ArrayList can be used
	as a generic data type, and how the enhanced for loop
	can be used to iterate over a ArrayList's contents.
*/

import java.util.ArrayList;   // Needed for the ArrayList class

public class GenericArrayListDemo3
{
   public static void main(String[] args)
   {
      // Create an ArrayList to hold BankAccount objects.
      ArrayList<BankAccount> list = 
                    new ArrayList<BankAccount>();
      
      // Add three BankAccount objects to the ArrayList.
      list.add(new BankAccount(100.0));
      list.add(new BankAccount(500.0));
      list.add(new BankAccount(1500.0));
      
      // Display each item.
		for (BankAccount account : list)
		{
   		System.out.println("Balance: $" +
			                   account.getBalance());
		}
   }
}