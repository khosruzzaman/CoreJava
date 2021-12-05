package com.this_Key_Word_122;

public class Person {
	String name;
	String hairColor;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
		}
	
	Person(String name, int age, String hairColor){
		this(name, age);
		this.hairColor = hairColor;
		
	}
	void additional() {
		System.out.println("Hair Color : "+hairColor);
	 
	}
void display() {
	this.additional(); // also can use without this key word
	additional();
	System.out.println("Name : "+name);
	System.out.println("Age : "+age);
}
}
