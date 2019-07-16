package com.headfirst.chp03;

public class Hobbits {
	
	String name;
	
	public static void main(String[] args){
		
		Hobbits [] h = new Hobbits[3];
		
		int z = 0;
		
		while (z<2){
			z = z +1;
			h[z] = new Hobbits();
			h[z].name = "Bilbo";
			
			if (z == 1) {
				h[z].name = "frodo";
				
			}//end of if
			
			if (z==2){
				h[z].name = "Sam";
				
			}//end of if
			
		
			System.out.println(h[z].name + " is a " + "good hobbit name.");
			
			
		}//end of while loop
		
		
		
		
		
	}//end of pub static

}//end of class
