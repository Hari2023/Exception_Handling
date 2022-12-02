package com.Run_Time_Exception.prac;

public class Arithmetic_Prac {
	
	public static void main(String[] args) {
		
		int a = 12;
		
		try {
			System.out.println(a);
			System.out.println(a/0);
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Exception Handled");
		}
		
		finally {
			System.out.println("Final Block");
		}
		
		
		
	}
	
	
	
	
	
	
	
	

}
