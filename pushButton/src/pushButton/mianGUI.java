package GUI;
import javax.swing.JFrame;

public class mainGUI {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Push Counter");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    PushCounterPanel panel = new PushCounterPanel();
	    frame.getContentPane().add(panel);

	    frame.pack();
	    frame.setVisible(true);
	}

}