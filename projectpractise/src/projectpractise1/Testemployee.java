package projectpractise1;

public class Testemployee {

	public static void main(String[] args) {
		
		/*
		 * Employee alex, india,john;
		 * 
		 * alex = new Employee(); india = new Employee(); john = new Employee();
		 */
		employe alex = new employe ();
		employe linda = new employe();
		employe john = new employe();

		alex.salary = 90000;
		alex.bonus = 20000;
		alex.CalCulateTotalPay();
		
		linda.salary = 1000000.00;
		linda.bonus = 23456.89;
		linda.CalCulateTotalPay();
		
		john.salary = 45000;
		john.bonus = 50000;
		john.CalCulateTotalPay();
		
	}
}
