package com.Super_Key_V_118;

public class B extends A {
	//int x = 10
	
	int x = 7;
	void display() {
		message();
		System.out.println("Sub class X = "+x);
		System.out.println("From Suber Class X = "+super.x);
	}
	@Override
	void message() {
		super.message();
		System.out.println("From child class.".toUpperCase());
	}

}
