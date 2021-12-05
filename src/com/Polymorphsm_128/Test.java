package com.Polymorphsm_128;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = new Shape();
		s[1] = new Ractangle(6, 7.69);
		s[2] = new Triangle(9.34, 45.13);

		for (int i = 0; i < 3; i++) {
			System.out.println(s[i].area());
		}

	}

}
