package com.sonatatwo;

public class Empimpl extends Employee implements Empintf {

	@Override
	public double skillBonus(int subjectUpgraded) {
		double salary = 10000;
	
		switch( subjectUpgraded) {
		case 1: subjectUpgraded = (int)  (salary+(salary *0.1));
		break;
		case 2: subjectUpgraded = (int)  (salary+(salary *0.2));
		break;
		
		
		}
		return subjectUpgraded;
	}
	@Override
	public void salCal() {
		
		
	}
		public static void main(String args[]) {
			Empimpl e1 = new Empimpl();
			System.out.println("Salary " + e1.skillBonus(1));
		}

}
