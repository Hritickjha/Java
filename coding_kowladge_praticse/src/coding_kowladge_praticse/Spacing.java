package coding_kowladge_praticse;

public class Spacing {
	int count = 0;
	public String outerSpacing(int num) {
		String Spacing ="";
		for(int i=num;i!=0;i/=10) {
			Spacing+=" ";
			count++;
		}
		return Spacing;
	}
	public String innerSpacing(int num) {
		String spaces="";
		for(int i=0; i<(2*count)-1; i++) {
			spaces+=" ";
		}
		for(int i=num/10; i!=0;i/=10) {
			spaces+="\b";
		}
		return spaces;
	}

}
