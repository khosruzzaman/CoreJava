package com.Equals_Operators_Equals;

//comparing by the machanism of " == " , equals(); and equalsIgnoreCase();
public class Test {
	
	public static void main(String[] args) {
		int a = 129;
		int b = 65;
	String com1 = "Khosruz";
	String com2 = "Khosruz";
 
	
	String com3 = new String("khosruz");
	String com4 = new String("Khosruz");
	
	System.out.println("Com 1 "+com1.equals(com4));
	System.out.println("Com 2 "+com2.equalsIgnoreCase(com4));
	System.out.println(com4 == com3);   //Non primitive data tupe
	System.out.println("com 4 "+ (a==b)); // Primitive data type
	//System.out.println("com 6 : "+ a.equals(b)); this is primitive datatype 
 
	
	}

}
