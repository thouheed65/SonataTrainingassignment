package com.sonatatwo;

public class Manager extends Employee{
	public void salCal() {
		
		System.out.println("employee Manager salary");
	}
	public static void main(String args[]) {
		Manager m1 = new Manager();
		m1.salCal();
	}

}
