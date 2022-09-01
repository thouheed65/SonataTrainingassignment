package com.sonatatwo;

public class SimpleExample {
	
	
	private int add(int a , int b) {
		return a+b;
	}
	
	int sub(int a ,int b) {
		return b-a;
	}
	
	protected int mul(int a ,int b) {
		return a*b;
		
	}
  public int div(int a ,int b) {
	  return a/b;
	  
  }
   public static void main(String[] args) {
	   SimpleExample s1 = new SimpleExample();
	   System.out.println(s1.add(3,4));
	   System.out.println(s1.sub(3,4));
	   System.out.println(s1.mul(3,4));
	   System.out.println(s1.div(3,4));
	 
}
}
