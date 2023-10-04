package gui;
import java.swing,Jframe;
public class maingui  {
	public  static void main (String[]args) {
		jFrame frame = new jFrame("push counter");
		frame.setDefaultCloseoperation(JFrame.EXIT_ON_CLOSE);
		
		pushcounterpanel panel = new pushcounterpanel();
		Frame.getcontentpane().add(pannel);
		
		frame.pack();
		frame.setvissible(true);
	}

}
