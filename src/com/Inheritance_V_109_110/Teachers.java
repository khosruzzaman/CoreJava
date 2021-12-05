package com.Inheritance_V_109_110;

public class Teachers extends Inheritances_Person {
	
	String title;
	String dept;
	
	void display2() {
		display1();
		System.out.println("Title : "+title);
		System.out.println("Deartment : "+dept);
	}
	
}
