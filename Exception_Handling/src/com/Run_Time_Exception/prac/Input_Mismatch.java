package com.Run_Time_Exception.prac;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input_Mismatch {
	public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
	
	try {
		System.out.println("Enter the value: ");
		int nextInt = a.nextInt();
		System.out.println((nextInt*nextInt));
		//System.out.println(a*a);
		
	} catch (InputMismatchException e) {
		e.printStackTrace();
System.out.println("InputMismatchException");
	}
	
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
