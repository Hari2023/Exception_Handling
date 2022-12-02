package com.Run_Time_Exception.prac;

public class IndexOutOfBound {
	
	public static void main(String[] args) {
		
		int a[] = new int [6];
		
		try {
			System.out.println(a[0]);
			System.out.println(a[6]);
			
		} catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("IndexOutOfBoundException");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
