package com.Abstract_Quize;

public class Ractangle extends Shape{
	//val1, val2
	//we know ractangel = Length * width 
	  Ractangle(double val1, double val2) {
		  
		  super (val1, val2) ;
	}

	@Override
	void area() {
		System.out.println("The Area of RActangle is : "+val1*val2);
		
	}
	   
	   

}
