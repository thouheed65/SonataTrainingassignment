package com.sonatafriday;

public class ParameterLambda {

	public static void main(String[] args) {
		Caltor c2 = (i1,i2) ->{return i1 - i2;};
		Caltor c3 = (i1,i2) ->{
			if(i2<i1) {
				throw new RuntimeException("message");}
			else {return i2 - i1;}
		};
		System.out.println(c2.substract(20,10));
			}
		
      MyFunctionalInterface show =()->{System.out.println("this is my");};


Bank
	int c = i1+i2;
	if(c >=50) {c++; }
	else c--;
	return c;
	
};

   System.out.println(b2.add(20,25));
}


