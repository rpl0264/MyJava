package com.headfirst.chp04;

public class ClockTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clock c = new Clock();
		c.setTime("12:45");
		String tod = c.getTime();
		System.out.println("time: " + tod);

	}

}

class Clock {
	String time;
	
	void setTime(String t){
		
		time = t;
		
	}
	
	String getTime(){
		
		return time;
	}
}
