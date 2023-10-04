package coding_knowladge;

public class Example1 {
 public static void main(String args[]) {
	 //Label outer for loop as 'outer'
	 outer:for(int x=1;x<=3;x++) {
		 for(int y=1;y<=3;y++) {
			 System.out.println(x+"-"+y);
			 if(y==2)break;
			 //break inner for loop if y==2
			 if(x==3)break outer;
			 //break outer for loop if x==3
		 }
	 }
 }
}
