package coding_knowladge;
import java.util.Scanner;
public class Example {
	public static void printOddEven(int num) {
		String x=num%2==0?"Even":"odd";
		System.out.println(num+" is"+x);
	}
	
	public static void main(String args[]){	
			Scanner input=new Scanner(System.in);
			while(true) {
				System.out.println("Input no: ");
			int x=input.nextInt();
			if(x==-1)break;
			printOddEven(x);
			}
	}
}