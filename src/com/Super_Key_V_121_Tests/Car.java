package com.Super_Key_V_121_Tests;

public class Car extends Vehicle {
	int seat;
	int gear;

	Car(int seat, int gear, int door, String color, double weight) {
		super(color, weight, door);
		this.seat = seat;
		this.gear = gear;

	}
	void express() {
		super.display();
		System.out.println("Seat size is :".toUpperCase()+seat);
		System.out.println("Total gear is : ".toUpperCase()+gear);
	}

}
