package com.Abstract_Quize;

public class Test {
	public static void main(String[] args) {
		
		Shape sh;
		sh = new Ractangle(10, 20);
		sh.area();
		
		sh = new Triangle(10, 20);
		sh.area();
		
		sh = new Circle(10);
		sh.area();
	}

}
