package com.Method_Return_Value;

// V_86 Over Loading Constrator

public class Teacher {
	String dept;
	String name;
	String gender;
	int phone;
	int identity;
	
	//Default Constractor
	 Teacher(){
		 System.err.println("Not Value");
	 }

	//Parameterized Constractor
	 Teacher(String dpt, String n, String g){
		 dept = dpt;
		 name = n;
		 gender = g;
	 }
	 
	 //Over loaded Parameterized Constractor
	 Teacher(int id, int ph){
		 phone = ph;
		 identity = id;
	 }
	 
	
	void displyInformaion() {
		System.out.println("Department : "+dept);
		System.out.println("ID Number : "+identity);
		System.out.println("Name : "+name);
		System.out.println("gender : "+gender);
		System.out.println("Cell Number : "+phone);
		
	}
}
