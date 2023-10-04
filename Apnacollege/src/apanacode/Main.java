package apanacode;
import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		//MINI project
		Scanner sc = new Scanner(System.in);
		int mynumber = (int)(Math.random()*100);
		int userNumber = 0;
		do {
			System.out.println("Guess my number :");
			userNumber = sc.nextInt();
			
			if(userNumber == mynumber) {
				System.out.println("WOOHO...CORRECT number!!!");
				break;
			}
			else if (userNumber > mynumber) {
				System.out.println("your number is too large");
			}
			else {
				System.out.println("your number is too small");
			}
		} while (userNumber >= 0);
	System.out.println("my number was :");
	System.out.println(mynumber);
	}
	
}
