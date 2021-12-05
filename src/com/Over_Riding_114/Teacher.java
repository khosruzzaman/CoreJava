package com.Over_Riding_114;

public class Teacher extends Person {
	//name, age, display
	
	String qualification;
	
	@Override
	void display() {
		System.out.println("Over ridden Method.");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Qualifications : "+qualification);
	}

}
