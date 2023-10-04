package coding_knowladge;

public class Exampl4 {
	public static void main(String args[]) {
		for(int i=1; i<=5; i++) {
			System.out.println("start"+i);
			if(i==3) {
				continue;
			}
			System.out.println("End"+i);
		}
	}
}
