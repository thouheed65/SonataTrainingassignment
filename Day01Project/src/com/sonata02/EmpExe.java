package com.sonata02;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import com.sonataImpl.EmpImpl;
import com.sonatamodel.Employee;



public class EmpExe {
	@Test
	public void EmpExe1() {
		Employee e3 = new Employee();
		EmpImpl e4 = new EmpImpl();
		e3.setEmpSal(100);
		double a = e4.yearSal(e3);
		Assertions.assertEquals(1200,a);
		
		
	}
}
		
		





