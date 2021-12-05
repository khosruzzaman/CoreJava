package com.Abstract_Quize;

public class Triangle extends Shape{
	//val1, val2
	//we know triangle = 0.5 * base * height 
	 
	Triangle(double val1, double val2) {
		super(val1, val2);
		 
	}
	@Override
	void area() {
		System.out.println("The arrea of Triangle is : "+0.5 * val1 * val2);
	}

}
