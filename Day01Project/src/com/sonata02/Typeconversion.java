package com.sonata02;

public class Typeconversion {

	public static void main(String[] args) {
		byte a;                                                                       
		  int b = 310;                                                                  
		  double c = 500.14;                                                            
		                                                                                
		  // Conversion of int to byte.                                                 
		  a = (byte) b;                                                                 
		  System.out.println("a and b: " + a + " " + b);                                
		                                                                                
		  // Conversion of double to int.                                               
		  b = (int) c;                                                                  
		  System.out.println("b and c: " + b + " " + c);                                
		                                                                                
		  //Conversion of double to byte.                                               
		  a = (byte) c;                                                                 
		  System.out.println("a and c: " + a + " " + c);                                
		 
	}

}
