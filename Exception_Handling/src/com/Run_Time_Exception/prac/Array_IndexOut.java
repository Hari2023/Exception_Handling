package com.Run_Time_Exception.prac;

public class Array_IndexOut {

	public static void main(String[] args) {
		int a[] = new int[5];

		a[0] = 1;

		try {
			System.out.println(a[0]);

			System.out.println(a[6]);

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("ArrayIndexOutOfBoundsException ");
		}
		
		catch (StringIndexOutOfBoundsException e) {
			//e.printStackTrace();
			System.out.println("StringIndexOutOfBoundsException  ");
		}
		
		catch (NullPointerException e) {
			//e.printStackTrace();
			System.out.println("NullPointerException  ");
		}
		finally {
			System.out.println("Finally Block");
		}

	}

}
