package com.sonata02;

public class Bank {
	int accNo;
	String accName;
	double balance;
	Bank() {}
	
	Bank(int a , String n, double b){
		this.accNo = a;
		this.accName = n;
		this.balance = b;
		
	}
	
	public double deposite(double amount) {
		double totalBal = balance+amount;
		
		
		
		return totalBal;
	}
	
	public double withDraw(double amount) {
		double totalBal = balance - amount;
		
		return totalBal;
	}
	

}
