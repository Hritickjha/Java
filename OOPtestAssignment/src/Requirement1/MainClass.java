package Requirement1;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import uk.ac.leedsbeckett.oop.LBUGraphics;

public class MainClass
	{
	        public static void main(String[] args)
	        {
	                new GraphicsSystem(); //create instance of class that extends LBUGraphics (could be separate class without main), gets out of static context
	        }
	        
	}