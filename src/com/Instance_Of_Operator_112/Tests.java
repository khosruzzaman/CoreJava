package com.Instance_Of_Operator_112;

public class Tests {
	public static void main(String[] args) {
		Animal a = new Animal();
		Persons p = new Persons();
		Teacher t = new Teacher();
		
		System.out.println(p instanceof Animal);  //false
		System.out.println(p instanceof Teacher); //false
		System.out.println(t instanceof Persons); //true
		System.out.println(a instanceof Teacher); //true
		System.out.println(a instanceof Persons); //true
		System.out.println(t instanceof Animal);  //false
		System.out.println(p instanceof Persons); //true
		System.out.println(t instanceof Teacher); //true 
		System.out.println(a instanceof Animal);  //true
	}
}
