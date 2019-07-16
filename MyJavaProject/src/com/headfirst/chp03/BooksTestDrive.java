package com.headfirst.chp03;

public class BooksTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Books [] myBooks = new Books[3];
		int  x =0;
		
		
		myBooks[0] = new Books();
		myBooks[1] = new Books();
		myBooks[2] = new Books();
		
		myBooks[0].title = "The Grapes of Wrath";
		myBooks[1].title = "The Great Gatsby";
		myBooks[2].title = "The Java Cookbook";
		
		
		myBooks [0].author = "bob";
		myBooks [1].author = "Jane";
		myBooks [2].author = "Charles";
		
		while (x < 3){
			
			System.out.print(myBooks[x].title + " by " + myBooks[x].author+ "\n");
			x = x + 1;			
			
		}//end of while
		

	}

}
