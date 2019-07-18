package com.gaddis.chp08;

import java.util.ArrayList; // Needed for ArrayList class

/**
 * This program demonstrates replacing an item.
 */
public class ArrayListDemo5 {

    public static void main(String[] args) {
        // Create an ArrayList to hold some names.
        ArrayList nameList = new ArrayList();
        ArrayList nameList2 = new ArrayList();

        // Add some names to the ArrayList.
        nameList.add("James");
        nameList.add("Catherine");
        nameList.add("Bill");

        // Display the items in nameList and their indices.
        for (int index = 0; index < nameList.size(); index++) {
            System.out.println("Index: " + index + " Name: "
                    + nameList.get(index));
        }

        // Now replace the item at index 1.
        nameList.set(1, "Becky");
        nameList2 = (ArrayList) nameList.clone();

        System.out.println("Catherine was replaced with Becky in nameList. "
                + "Here are the items now.");

        // Display the items in nameList and their indices.
        for (int index = 0; index < nameList.size(); index++) {
            System.out.println("Index: " + index + " Name: "
                    + nameList.get(index));
        }
        
        // Now replace the item at index 1.
        nameList2.set(1, "Harold");
       

        System.out.println("Catherine was replaced with Harold in nameList2. "
                + "Here are the items now.");

        // Display the items in nameList and their indices.
        for (int index = 0; index < nameList2.size(); index++) {
            System.out.println("Index: " + index + " Name: "
                    + nameList2.get(index));
        }
    }
}