package com.sonatafriday;

public interface Machine {
	

	
		String speedUp();
		
		String slowDown();
		
		default String turnAlarmOn() {
			return "Turning the vehcile alarm on.";
		}
		
		 
		 default String turnAlarmOff () {
	 return "Turning the vehcile alarm off.";
	 
		}

	}


