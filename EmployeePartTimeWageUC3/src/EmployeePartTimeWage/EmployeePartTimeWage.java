package EmployeePartTimeWage;

public class EmployeePartTimeWage {
	 static int IS_PRESENT =1;
	static int IS_PART_TIME =2;
	static int WAGE_PER_HOUR =20;
	static int FULL_TIME =8;
	static int PART_TIME =4;
	static int empwage =0;
	

	public static void main(String[] args) {
	

		double empcheck = Math.floor(Math.random() * 10) % 3;
		System.out.println("empCheck=>" +empcheck);
		
		
		if (empcheck == IS_PRESENT)
		{
			System.out.println("Employee is Present");	
		empwage = FULL_TIME * WAGE_PER_HOUR;
		
		}
		
		else if(empcheck == IS_PART_TIME)
		{
			System.out.println("Employee working as Part time");	
		empwage = FULL_TIME * PART_TIME;
			
			
		}
		else
		{
		System.out.println ("Employe is Abscent");
		empwage = 0;
		}	
		System.out.println ("Employe wage = " +empwage);
	}
}

