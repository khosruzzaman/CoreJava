package com.OOP_Over_Loading;

//V_86 Over Loading Constrator

public class Test_1 {
	public static void main(String[] args) {
		 
		Teacher techer1 = new Teacher();
		techer1.displyInformaion();
		System.out.println();
		
		Teacher teacher2 = new  Teacher("IT", "Khosruz", "Male");
		teacher2.displyInformaion();
		
		System.out.println();
		
		Teacher teacher3 = new Teacher(56789, 0213);
		teacher3.displyInformaion();
		 
		
		
	}
}