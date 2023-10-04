package learnjavabasic9;

public class exampleString {

	public static void main(String[] args) {
		
		String x = "James Dean";
		
		System.out.println("hello" + x);
		
		System.out.println(x.toUpperCase());
		
		System.out.println(x.substring(2));
		
		System.out.println(x.substring(2,7));
		
		System.out.println(x.charAt(3));
		
		String age = "37";
		String Salary = "7895.83";
		//wrapper Classes
		
		int a = Integer.parseInt(age)+ 2;
		System.out.println(a);
		
		double s = Double. parseDouble(Salary) * .15;
		System.out.println(s);
		
	}
}
