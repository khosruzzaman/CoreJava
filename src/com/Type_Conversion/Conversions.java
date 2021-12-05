package com.Type_Conversion;


//Type Conversion V_100


public class Conversions {
	void add() {
		System.out.println("Empty Method");
	}
//	void add(int a, int b){
//		int res = a+b;
//		System.out.println(" Over Loaded with 2 integer parameters : "+res);
//	}
	
	void add(double a, double b, double c) {
		double res = a*b*c; 
		System.out.println("Over Loaded with 3 double Parameters : "+res);
		
	}
	
	void add(String name, String gender) {
		System.out.println("Over Loaded with 2 String Parameters: ");
		System.out.println("Name : " +name);
		System.out.print("Gender : " +gender);
		System.out.println();
	}
	 void add (char depCode, float length) {
		 System.out.println("Char Valu "+ depCode + " "+length+54);
		 
		 
	 }

}
