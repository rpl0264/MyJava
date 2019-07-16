package com.headfirst.chp02;

public class TapeDeckTestDrive {
	
	public static void main(String[] args){
		
		TapeDeck t = new TapeDeck();
		t.canRecord=true;
		
		if (t.canRecord==true){
			
			t.recordTape();
		}
		
	}
	
	

}
