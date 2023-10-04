package GUItutuorial;

import java.Swing.Jframe;


public class mainGUI {
	public Static void main(string[] args) {
		
		jframe frame = new Jframe("style options");
		frame.setDefaultCloseoperation(jFrame.EXIT_ON_cLOSE);
		
		frame.getcontentpane().add(new styleoperationpanel());
		
		frame.pack();
		frame.setvisible(true);
		
	}

}
