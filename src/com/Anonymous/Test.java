package com.Anonymous;

public class Test {
	public static void main(String[] args) {
		Person p1 = new Person() {
			@Override
			void display() {
				System.out.println("Test Class");

			}
			
		};
		p1.display();
		Person p2 = new Person();
		p2.display();
	}
}
