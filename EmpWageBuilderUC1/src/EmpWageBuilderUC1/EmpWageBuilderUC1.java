package EmpWageBuilderUC1;

public class EmpWageBuilderUC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int IS_FULL_TIME =1; //COMPUTATION
		
		double empcheck = Math.floor(Math.random() * 10) % 2;
		
		if (empcheck == IS_FULL_TIME)
			System.out.println ("Employe is Present");
		else
			System.out.println ("Employe is Abscent");

	}

}
