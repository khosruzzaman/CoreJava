package com.Recurssion;

import java.util.Scanner;

public class Factorial_iteration {
	public static void main(String[] args) {
		int num ;
		int fact = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number: ");
		num = sc.nextInt();
		for (int i = 1; i <=num; i++) {
			fact = fact*i;
	 
		}
		System.out.print("Factorial is for "+num+" = " +fact);
		
	}
	}
