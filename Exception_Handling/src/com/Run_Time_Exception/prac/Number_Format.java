package com.Run_Time_Exception.prac;

public class Number_Format {
	
public static void main(String[] args) {
	
	String a = "!10";
	System.out.println(a);
	
	try {
		int parseInt = Integer.parseInt(a);
		System.out.println(parseInt+10);
		
	} catch (NumberFormatException e) {
		e.printStackTrace();
		System.out.println("NumberFormatException");
	}
	finally {
		System.out.println("Final Block");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
