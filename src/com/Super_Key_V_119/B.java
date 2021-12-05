package com.Super_Key_V_119;

public class B extends A {
	// x = 20; message(); display1();

	int x = 15;
	String name = "Zaman";

	@Override
	void message() {
		super.name = "zaman";
		super.message();
		System.out.println(super.name + " " + name);
		System.out.println("Child Class");
		System.out.println("Value of X Child Class: " + x);

	}

	void display() {
		super.message();
	}
}