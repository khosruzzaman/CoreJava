package com.Polymorphsm_128;
 

public class Ractangle extends Shape {
	// area(); already here
	double length, weidth;

	Ractangle(double length, double weidth) {
		this.length = length;
		this.weidth = weidth;
	}

	@Override
	double area() {
		System.out.print("Ractangle Value : ");
		return length * weidth;
	}
}
