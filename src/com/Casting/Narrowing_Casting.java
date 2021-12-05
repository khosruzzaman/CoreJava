package com.Casting;

//Narrowing Casting: double > float > long > int > short > byte
public class Narrowing_Casting {
	public static void main(String[] args) {
		System.err.println("Narrowing Casting:");
		double d = 12.30;
		float f = (float) d;
		System.out.println("Double = " + d);
		System.out.println("Float = " + f);

		long l = 12;
		int i = (int) l;
		System.out.println("Long = " + l);
		System.out.println("Int = " + i);

		short s = 15;
		byte b = (byte) s;
		System.out.println("Short = " + s);
		System.out.println("Byte = " + b);

	}

}
