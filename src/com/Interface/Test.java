package com.Interface;

public class Test {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		c.bark();
		c.bite();
		c.run();
		System.out.println();
		Dog d = new Dog();
		d.bark();
		d.bite();
		d.eat();
		d.run();
	}

}
