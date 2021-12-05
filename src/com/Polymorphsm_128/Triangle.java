package com.Polymorphsm_128;

public class Triangle extends Shape{
// area(); is here;
	
	double base, height;
	  Triangle(double base, double heigth) {
		this.base =base;
		this.height = heigth;
	}
	  @Override
	  double area() {
		  System.out.print("Triangle value : ");
		  return base*height;
	  }
}
