package com.Use_Private_Member_111;

public class Car_Brand {
	private String company;
	private String manufacturingCountry;
	
	public void setCompanyName(String company) {
		this.company = company;
		
	}
	public String getCompanyName() {
		return company;
	}
	
	public void setManufac(String manufacturingCountry) {
		this.manufacturingCountry = manufacturingCountry;
		
	}
	public String getManufac() {
		return manufacturingCountry;
	}
 void display() {
	 System.out.println("Company Name : "+company);
	 System.out.println("Manufacture by : "+manufacturingCountry);
 }
}
