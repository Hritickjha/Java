package coding_knowladge;

public class Example2 {

	public static void main(String[] args) {
		L1:while(true) {
			System.out.println("Start");
		while(true) {
			System.out.println("Inner While");
			break L1;
			}
		}
	}
}
