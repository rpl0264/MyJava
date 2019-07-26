package com.oracle.packt.chp2.basics;

public class ConstantVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//pi is a CONSTANT. You don't want it to change
		//use FINAL
		final float pi = 3.14159f;
		
		System.out.println( pi );
		
		System.out.println( pi );
		
		//this will complain since it is a constant value
		//pi = 4;
	}

}
