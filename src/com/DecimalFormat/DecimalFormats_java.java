package com.DecimalFormat;

import java.text.DecimalFormat;

public class DecimalFormats_java {
	
	public static void main(String[] args) {
		DecimalFormat obj = new DecimalFormat("0.00");
		double x = 2.74384848;
		System.out.println("X = "+obj.format(x));
	}

}
