package com.Casting;

public class Test {
	public static void main(String[] args) {
		// These are reguler implementations
		System.out.println("These are reguler implementations ");
		Dog d = new Dog();
		d.display();
		Cat c = new Cat();
		c.display();

		System.out.println("\nSpecial implementations.");
		// Special implementations.
		Cat c2 = new Dog(); // this will be work
		c2.display();
		// Special machanism will not work on run time
		System.out.println("This not gonna work and run time error because JAVA doesnt support it");
		Dog d2 = (Dog) new Cat(); // --> This not gonna work and run time error because JAVA doesnt support it
		d2.display();

	}

}
