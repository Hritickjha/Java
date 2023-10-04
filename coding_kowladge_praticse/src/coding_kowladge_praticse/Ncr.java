package coding_kowladge_praticse;

public class Ncr {
	public double findNcr(int n, int r) {
		return factorial(n)/(factorial(n-r)*factorial(r));
	
	}
	public double factorial(int n) {
		double result=1;
		for(int i=2; i<=n; i++) {
			result*=i;
		}
		return result;
		/*Return the factorial of n*/
	}
	
	}
}
