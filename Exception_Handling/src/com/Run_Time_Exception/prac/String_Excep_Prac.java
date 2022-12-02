package com.Run_Time_Exception.prac;

public class String_Excep_Prac {
	
public static void main(String[] args) {
	
	try {
		String a = "Selenium";
		System.out.println(a.charAt(0));
		System.out.println(a.charAt(8));
		
	} catch (StringIndexOutOfBoundsException e) {
		e.printStackTrace();
System.out.println("StringIndexOutOfBoundsException");
}
finally {
	System.out.println("Finally Block");
}	
	
	
	
	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
