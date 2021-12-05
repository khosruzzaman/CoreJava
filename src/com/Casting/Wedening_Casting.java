package com.Casting;
/*
 	Wedening Casting: byte > short > int > long > float > double We
   	
*/

public class Wedening_Casting {
	public static void main(String[] args) {

		System.err.println("Wedening Casting:");
		// Wedening Casting:
		byte b = 12;
		short s = b;
		System.out.println("Short = " + s);
		System.out.println("Byte = " + b);
		int i = 10;
		float f = i;
		System.out.println("int = " + i);
		System.out.println("float = " + f);
		long l = 56;
		double d = l;
		System.out.println("Long = " + l);
		System.out.println("Double = " + d);

	}

}
