package com.Super_Key_V_121_Tests;

public class Vehicle {
	String color;
	double weight;
	int door;

	 Vehicle(String color, double weight, int door) {
		this.color=color;
		this.weight=weight;
		this.door=door;
	}
	 void display() {
		 System.out.println("Car Color is : ".toUpperCase()+color);
		 System.out.println("Car Weight is : ".toUpperCase()+weight);
		 System.out.println("Car door is : " .toUpperCase()+ door);
	 }
	 
}
