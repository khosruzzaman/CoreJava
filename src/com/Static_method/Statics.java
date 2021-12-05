package com.Static_method;

//V_92
//Static method/ Variable can not use within no static method 

public class Statics {
	static int id;
	static String name;
	static {
		id = 130;
		name = "Khosru";
		System.out.println("Static Are You Creazy!!");
		

	}	
	void display() {
		System.out.println("ID = "+id);
		System.out.println("Name = "+name);
	
	}
	public static void main(String[] args) {
		System.out.println("main Method");
	}
	
}





//Static method/ Variable can not use within no static method 
/*static 	int x = 0;

	void display1() {
		x = 19;
		System.out.println("i am non static method");
		System.out.println("Value = "+x);
	}

	static void display2() {
		x = 10;
		System.out.println("i am Static method "+ x);
	}*/