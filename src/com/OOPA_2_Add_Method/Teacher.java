package com.OOPA_2_Add_Method;

// V_84

public class Teacher {
	String name;
	String gender;
	int phone;

	void setInformation(String n, String g, int ph) {
		name = n;
		gender = g;
		phone = ph;

	}

	void displayInformation() {
		System.out.println("Name : " + name);
		System.out.println("Gender : " + gender);
		System.out.println("Phone : " + phone);

	}

}
