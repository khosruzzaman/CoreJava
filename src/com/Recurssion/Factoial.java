package com.Recurssion;

import java.util.Scanner;

public class Factoial {
	public static void main(String[] args) {
		int n = 0;
		Recurssion fac = new Recurssion();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Number : ");
	    n = sc.nextInt();
	   int result = fac.fact(n);
		System.out.println("Factorial Value for "+ n + " is = " +result);
	}
	

}
