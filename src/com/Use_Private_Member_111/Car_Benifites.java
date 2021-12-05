package com.Use_Private_Member_111;

public class Car_Benifites extends Car_Brand {
	private String color;
	private String transmission;

	public void setColore(String color) {
		this.color = color;
	}

	public String getColore() {
		return color;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getTransmission() {
		return transmission;
	}
	
	void display2() {
		display();
		System.out.println("Color of this car is : "+color);
		System.out.println("Transmission System is : "+transmission);
		
	}
}
