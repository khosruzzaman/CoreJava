package com.Passing_Arguments_V_102;

public class Test_2 {
	public static void main(String[] args) {
		CallByValue c2 = new CallByValue();
		int x = 10;
		System.out.println("X before Call : "+x);
		
		c2.change(x);
		System.out.println("X after call : "+x);
	}

}
