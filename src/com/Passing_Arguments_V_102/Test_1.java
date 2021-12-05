package com.Passing_Arguments_V_102;

public class Test_1 {
	public static void main(String[] args) {
		CallByRrference r1 = new CallByRrference();
		r1.name = "Zaman";
		System.out.println("Befor calling : "+r1.name);
		
		r1.change(r1);
		System.out.println("After Change : " +r1.name);
	}

}
