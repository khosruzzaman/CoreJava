package com.Abstract_Quize;

public class Circle extends Shape{
	
	//val1, val2
	
	// We know Circle = PI * redious * redious
	double r;
	Circle(double r){
		super(r, r);
		
	}

	@Override
	void area() {
		System.out.println("The Area of Circle is : "+Math.PI * val1 * val2);
		
	}

}
