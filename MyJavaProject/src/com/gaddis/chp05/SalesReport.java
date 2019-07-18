package com.gaddis.chp05;

import java.io.*;                // For file I/O classes
import java.text.DecimalFormat;  // For the DecimalFormat class
import javax.swing.JOptionPane;  // For the JOptionPane class

/**
   This program opens a file containing the sales
   amounts for 30 days. It calculates and displays
   the total sales and average daily sales.
*/

public class SalesReport
{
   public static void main(String[] args) throws IOException
   {
      final int NUM_DAYS = 30; // Number of days of sales
      String filename;         // The name of the file to open
      String dirPath;
      double totalSales;       // Total sales for period
      double averageSales;     // Average daily sales
     
      
      // Get the name of the file: MonthlySales.txt
      dirPath = "C:/murach/Gaddis/src/com/gaddis/chp05/";
      filename = dirPath + getFileName();
      
      // Get the total sales from the file.
      totalSales = getTotalSales(filename);
      
      // Calculate the average.
      averageSales = totalSales / NUM_DAYS;
      
      // Display the total and average.
      displayResults(totalSales, averageSales);
      
      System.exit(0);
   }

   /**
      The getFileName method prompts the user to enter
      the name of the file to open.
      @return A reference to a String object containing
              the name of the file.
   */
   
   public static String getFileName()
   {
      String file;   // To hold the file name
      
      // Prompt the user to enter a file name.
      //HINT: Enter MonthlySales.txt
      file = JOptionPane.showInputDialog("Enter " +
                         "the name of the file\n" +
                         "containing 30 days of " +
                         "sales amounts.");

      // Return the name.
      return file;
   }     
      
   /**
      The getTotalSales method opens a file and
      reads the daily sales amounts, accumulating
      the total. The total is returned.
      @param file The name of the file to open.
      @return The total of the sales amounts.
   */
   
   public static double getTotalSales(String file)
                                throws IOException
   {
      double total = 0.0;  // Accumulator
      double sales;        // A daily sales amount
      String input;        // To hold file input

      // Open the file.
      FileReader freader = new FileReader(file);
      BufferedReader inputFile = new BufferedReader(freader);
      
      // Read the first line from the file, assign to input.
      input = inputFile.readLine();
      
      // This loop processes the lines read from the file,
      // until the end of the file is encountered.
      while (input != null)
      {
         // Convert input to a double and assign it to sales.
         sales = Double.parseDouble(input);
         
         // Add sales to the value already in total.
         total += sales;
         
         // Read the next line from the file, assign to input.
         input = inputFile.readLine();       
      }
      
      // Close the file.
      inputFile.close();
      
      // Return the total sales.
      return total;
   }
   
   /**
      The displayResults method displays the total and
      average daily sales.
      @param total The total sales.
      @param avg The average daily sales.
   */
   
   public static void displayResults(double total, double avg)
   {
      // Create a DecimalFormat object capable of formatting
      // a dollar amount.
      DecimalFormat dollar = new DecimalFormat("#,###.00");
      
      // Display the total and average sales.
      JOptionPane.showMessageDialog(null, "The total sales for " +
                        "the period is $" + dollar.format(total) +
                        "\nThe average daily sales were $" +
                        dollar.format(avg));
   }
}
