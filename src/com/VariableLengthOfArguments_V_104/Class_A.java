package com.VariableLengthOfArguments_V_104;

public class Class_A {
	
	
	void change(int ... number) {
		int sum = 0;
		for(int x : number ) {
			sum = sum+x;
		}
		System.out.println("The Total Value is : "+sum);
		
		
	}

	 
}
