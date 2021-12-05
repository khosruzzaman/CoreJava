package com.OOPA_2_Add_Method;

//V_84

public class Test_1 {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.setInformation("Khosruz zaman", "Male", 343375130);
		teacher.displayInformation();

		System.out.println();

		Teacher teacher1 = new Teacher();
		teacher1.setInformation("Salama Khanom", "Female", 59895646);
		teacher1.displayInformation();

	}
}