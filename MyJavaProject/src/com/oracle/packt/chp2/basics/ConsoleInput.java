package com.oracle.packt.chp2.basics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInput {
/*The Console is a window of the operating system through which users can interact
 *  with system programs of the operating system or with other console 
 *  applications. The interaction consists of text input from the standard input
 *   (usually keyboard) or text display on the standard output (usually on the 
 *   computer screen).
 *   
	*/
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//get content
		BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
		
		//need to store the content  entered
		String name = reader.readLine( );  
		
		//print it out
		System.out.println( name );
	}

}
