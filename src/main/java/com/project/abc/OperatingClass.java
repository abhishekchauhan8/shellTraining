package com.project.abc;

public class OperatingClass {
	
	public String logic(int marks) {
		if(marks <= 35 )
			return "fail";
		else if(marks>3 && marks <=50)
			return "3rd class";
		else if(marks>50 && marks <=75)
			return "2nd class";
		else if(marks>76 && marks <=100)
			return "1st class";
		else
			return "Wrong input";
	}

}
