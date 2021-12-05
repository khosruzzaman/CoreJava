package com.Final_Key_Word_123_124;

public class University {
	final String UNIVERSITY_NAME = "MU"; //initialized final variable 
	final int fees;
	static final int salary;
	
	//blank final would be initiated by constractor
	  University(int fees) {
		   
		this.fees =fees;
 
	}
	
	  //Static Blank final variable would be initiated by static block.
	  static {
		  salary = 10000;
		  
	  }
	  
	  void display() {
		  System.out.println("Name of University is : "+UNIVERSITY_NAME);
		  System.out.println("Samister Fees is : "+fees);
		  System.out.println("Monthly Salary is : "+salary);
	  }
	
}
