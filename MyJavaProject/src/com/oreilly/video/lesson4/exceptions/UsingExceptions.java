package com.oreilly.video.lesson4.exceptions;

public class UsingExceptions {

	public static void main(String[] args) {
		  
		try {
			throwException(); // call method throwException
			System.out.println("1. Continue with Main code after throwException\n");
		} //end of try
		catch (Exception exception) 
		{
			
			System.out.println("2. Exception handled in MAIN method");
			
		}//end of try catch
		
		doesNotThrowException();

	}//end of main
	
	//demonstrate try...catch...finally
	public static void throwException() throws Exception {
		
		try {
			System.out.println("3. Method ThrowException\n");
			throw new Exception();
			//nothing here will be executed
		} catch (Exception exception) {
			
			System.out.println("4. Exception handled in Method ThrowException");
			
		}// end of try catch
		
	}//end of throwException
	
	public static void doesNotThrowException() {
		
		try {
			System.out.println("5. Method doesNotThrowException\n");
			
		}//end of try
		catch (Exception exception) {
			System.out.println(exception);
		}//end of try catch
		finally {
			System.out.println("6. Finally executed in doesNotThrowException");
		}//end of finally
		
	}//end of doesNotThrowException
	

}//end of UsingExceptions
