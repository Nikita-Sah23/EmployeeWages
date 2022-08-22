package EmpWageUsingSwitch;

public class EmpWageUsingSwitch {

	public static void main(String[] args) {
		
		int empcheck = (int)(Math.floor(Math.random() * 10)) % 2; // explicit typecasting
		
	  switch (empcheck) {
	
      case 0:  // WHEN EMP IS PRESENT
        System.out.println("Employee is Present");
			        switch ( (int)(Math.floor(Math.random() * 10)) % 2) 
			        //0 - > part_time
			        //1 --> full time
			        {
			        case 0:		        	
			        	System.out.println("part time EmpWage : " + 8*20);  //per day		         			        
			        	break;
			        case 1:			        	
			        	System.out.println("full time EmpWage : " + 8*20); //per day			        	
			        }
			        break;
      case 1: //  WHEN EMP IS ABSCENT
    	  System.out.println("Employee is Abscent");
    	  break;
    
		}
 
	}
}

/*
type casting ; 
1) upcasting -- convert lower datatype to higher datatype
2) down casting=- high to low

*/