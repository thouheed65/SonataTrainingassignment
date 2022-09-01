package com.sonata02;

public class Savingexample {
	int accNo;
	String accName;
	double balance;
	Savingexample() {}
	
	Savingexample(int n, String name , double b){
		this.accNo = n;
		this.accName = name;
		this.balance = b;
		
	}
	
	public void deposite() {
		System.out.println(this.accNo);
	}
	
	public void withDraw() {}
	
	public static void main(String args[]) {
		Savingexample s1 = new Savingexample();
		s1.accNo = 123;
		s1.accName = "Thouheed";
		s1.balance = 443;
		s1.deposite();
		
		Savingexample s2 = new Savingexample(234,"Santosh",456);
		s2.deposite();
	}
}
   