package com.Method_Over_Loading;
  
//Method Over Loading V_99

public class OverLoad {
	

	void add() {
		System.out.println("Empty Method");
	}
	void add(int a, int b){
		int res = a+b;
		System.out.print("Same as Add Method But");
		System.out.println(" Over Loaded with 2 integer parameters : "
				+ a +" + "+b + " = "+res);
	}
	
	void add(double a, double b, double c) {
		double res = a*b*c;
		System.out.print("Same as Add Method But");
		System.out.println("Over Loaded with 3 double Parameters : "+ a +" * "+b+" * "
				+ c +" = "+res);
		
	}
	
	void add(String name, String gender) {
		 
		System.out.print("Same as Add Method But");
		System.out.println("Over Loaded with 2 String Parameters: ");
		System.out.println("Name : " +name);
		System.out.print("Gender : " +gender);
	}
	 
}
