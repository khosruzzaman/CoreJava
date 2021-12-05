package com.Polymorphsm_128;

import java.util.Scanner;

public class Tests {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input an integer between 0 and 1000");
		int num = sc.nextInt();
		for (int i = 0; i <=num; i++) {
			for (int j = 0; j <i; j++) {
				System.out.print(i +" X " + j + " = "+ j);
			 //System.out.print(j);
			}
			System.out.println();
			
		}
		
	}
}
