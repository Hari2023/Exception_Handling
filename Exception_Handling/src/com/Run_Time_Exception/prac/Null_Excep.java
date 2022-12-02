package com.Run_Time_Exception.prac;

import java.util.Set;
import java.util.TreeSet;

public class Null_Excep {
	public static void main(String[] args) {
		Set<Integer> a = new TreeSet<Integer>();
		a.add(10);
		a.add(20);
		System.out.println(a);
		
		

		try {
            a.add(null);
			System.out.println(a);

		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("NullPointerException");

		} finally {
			System.out.println("Finally Block");
		}

	}

}
