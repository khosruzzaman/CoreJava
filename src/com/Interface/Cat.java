package com.Interface;

public class Cat implements Behaviour, Characteristics {
	public void bark() {
		System.out.println("Cat's can not bark");
	}
	public void bite() {
		System.out.println("Cat's Can Bit");
	}
	 public void eat() {
		 System.out.println("Cat's can Eat");
	 }
	 public void run() {
		 System.out.println("Cat's can Run");
	 }
}
