package com.sonatathree;

public class CallCustomException {

	public static void main(String[] args) throws MyownException{
		int age = 21;
		if(age<18) {
			throw new MyownException("age is less than 18");}
		else {
			System.out.println("Welcome to Vote");
		}
		
		}
		

	}


