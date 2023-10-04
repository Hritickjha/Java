package coding_kowladge_praticse;

import java.util.Scanner;

public class pascalsTriangle {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rows? :");
		int rows = sc.nextInt();
		/*gets the number of rows requested by the user*/
		Printer1.printTriangle(rows);
		/*prints the pascals triangle for the request number of rows*/
		
	}
}
