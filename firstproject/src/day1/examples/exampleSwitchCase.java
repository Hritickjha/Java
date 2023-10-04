package day1.examples;

public class exampleSwitchCase {
	public static void main(String[] args) {
		String j = "Two";
		switch(j){
		case "zero":
			System.out.println("value is 0");
			break;
		case "one":
			System.out.println("value is 1");
			break;
		case "two":
			System.out.println("value is 2");
			//break;
		case "three":
			System.out.println("value is 3");
			break;
		default:
			System.out.println("No value");
			break;
		
		}
	}
}
