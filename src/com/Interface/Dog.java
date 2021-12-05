package com.Interface;

public class Dog implements Characteristics   {
	public void bark() {
		System.out.println("Dog's Can bark");
	}
	public void bite() {
		System.out.println("Dog's Can bite");
	}
	@Override
	public void eat() {
		
		System.out.println("Dpg's Can Eat");
	}
	@Override
	public void run() {
		System.out.println("Dog's Can run");
		 
		
	}
	

}
