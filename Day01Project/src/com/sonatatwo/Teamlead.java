package com.sonatatwo;

public class Teamlead extends Employee {
	
	public void salCal() {
		
		System.out.println("Employee TeamLead Salary");
	}
	
	public static void main(String args[]) {
		Teamlead t1 = new Teamlead();
		t1.salCal();
		
	}

}
