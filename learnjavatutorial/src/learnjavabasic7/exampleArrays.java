package learnjavabasic7;

public class exampleArrays {

	public static void main(String[] args) {
		
		/*
		 * int a = 10; int b = 20; int c,d,e; c = 30; d = 40; e = 50;
		 * 
		 */
		/*
		 * int a1 = 10; int a2 = 20;
		 */
		int [] a = {10,20,30,40,50};
		
		System.out.println(a[2] + " " +a[4]);
		
		//enhance for
		for( int temp : a) {
			System.out.println(temp);
		}
		String[ ] stx  = new String[5];
		
		stx[3] = "25";
		stx[0] = "12";
	
		}
	}