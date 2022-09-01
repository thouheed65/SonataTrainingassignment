package com.sonatatwo;

import com.sonatatwo.SimpleExample;
public class Packageexample extends SimpleExample {

	public static void main(String[] args) {
		SimpleExample s1 = new SimpleExample();
		s1.div(10,2);
		
		Packageexample p1 = new Packageexample();
		System.out.println(p1.div(10,2));
		System.out.println(p1.mul(10,2));
		

	}

}
