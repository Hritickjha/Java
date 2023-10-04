package coding_knowladge;

public class Exampl3 {

	public static void main(String[] args) {
		label:do {
			System.out.println("hello !");
			continue label;
		}while(false);
	/*The above loop is not an infinite loop because continue
	 * means "proceed to the loop control logic for the next iteration".It doestn,t mean start the next loop iteration unconditionally;*/
		
	}
}
