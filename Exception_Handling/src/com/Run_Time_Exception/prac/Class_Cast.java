package com.Run_Time_Exception.prac;

public class Class_Cast extends Check {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);

		try {
			Class_Cast b = (Class_Cast) new Check();

		} catch (ClassCastException e) {
			e.printStackTrace();
			System.out.println("ClassCastException");
		}
		
		finally {
			System.out.println("Finally Block");
		}

	}

}
