package com.OOPA_1;

import java.util.Iterator;

public class Test_1 {
	public static void main(String[] args) {
		Teacher teacher1 = new Teacher();
		Teacher teacher = new Teacher();
		teacher1.name = "Khosruz zaman";
		teacher1.gender= "Male";
		teacher1.phone = 5789565;
		teacher.name = "Salama Khanom";
		teacher.gender= "Female";
		teacher.phone = 487865;
		teacher1.displayInformation();
		System.out.println();
		teacher.displayInformation();
		
		
	}
}