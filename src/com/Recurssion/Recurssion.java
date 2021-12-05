package com.Recurssion;

public class Recurssion {

	public static void main(String[] args) {

	}

	int fact(int n) {
		if (n == 1) {
			return 1;
		} else
			return n * fact(n - 1);

	}
}