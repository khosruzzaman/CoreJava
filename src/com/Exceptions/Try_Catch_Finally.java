package com.Exceptions;

public class Try_Catch_Finally {
	public static void main(String[] args) {
		
	
		try {
			int x = 10;
			int y = 0;
			int result = x/y;
			System.out.println("The result is : "+result);
			
		} catch (NullPointerException e) {
			System.out.println("Type of Exceptions is : "+e);
		} catch (ArrayIndexOutOfBoundsException e2){
			System.out.println("Type of exception : "+e2);			
		}catch (ArithmeticException e3){
			int x= 10;
			int y = 20;
			System.out.println(x*y);
			System.out.println("Type of Exception is "+e3);
		}catch(Exception e4){
			System.out.println("Type of Exception " +e4);
		}finally {
		System.out.println("\nProgram has been end.");
		int x= 10;
		int y = 20;
		System.out.println(x+y);
		}
	}

}
 