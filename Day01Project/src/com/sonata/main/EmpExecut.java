package com.sonata.main;

import com.sonataImpl.EmpImpl;
import com.sonatamodel.Employee;

public class EmpExecut {
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpID(123);
		e1.setEmpName("thouheed");
		e1.setEmpSal(100);
	
		EmpImpl e2 = new EmpImpl();
		System.out.println(e2.yearSal(e1));
		System.out.println(e2.appSal(e1));
	}

}
