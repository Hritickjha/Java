package coding_kowladge_praticse;

public class Printer1 {

	public static void printTriangle(int rows) {
		Ncr ncr = new Ncr();
		double largest = (rows-1)%2 ==0?
		ncr.findNcr((rows-1),(rows+1)/2-1):
		ncr.findNcr((rows-1), rows/2-1);
		/* The largest numnber in the triangle exists as the mid
		 * value of the last row. if the last row has an odd numbers,'r
		 * value of mid term is given by (rows+1)/2-1.If even then 'r' value is represented rows/2-1*/
		Spacing s = new Spacing();
		String oSpaces;
		oSpaces = s.outerSpacing((int)largest);
		/*Spacing should be kept based on the largest value. IT helps to preserve the triangular shaps when displaying the entire trianle*/
		
		for(int n=0; n<rows; n++) {
			System.out.print(n+"->");//exponent
			for(int i=0; i<rows-n; i++) {
				System.out.print(oSpaces);
			}
			for(int r=0;r<=n;r++) {
				int num =(int)ncr.findNcr(n,r);
				String iSpaces=s.innerSpacing(num);
				/*spacing to be kept before printing num is based on the number of digits is num*/
				System.out.println(iSpaces+num);
			}
			System.out.println();
		}
	}
}