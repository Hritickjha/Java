package final_project_assignment;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import uk.ac.leedsbeckett.oop.LBUGraphics;

public class Main extends LBUGraphics {

	public static void main(String[] args) {
		new Main();
		
	}

	public Main()

	{
		JFrame MainFrame = new JFrame();                     // create a frame to display the turtle panel on
		MainFrame.setLayout(new FlowLayout());               // not strictly necessary
		MainFrame.add(this);                                 // "this" is this object that extends turtle graphics so we are adding a turtle
		MainFrame.setSize(850,450);						     // graphics panel to the frame
		MainFrame.pack();                                    // set the frame to a size we can see
		MainFrame.setVisible(true);                          // now display it
		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                                            		// call the LBUGraphics about method to display version information.
		
		//setStroke(10);
		//Circle(150);
		//about();
		//penDown();
		
		//setPencolor(color.green);
		//BufferedImage bufIMG = getBufferedImage();
		//Graphics g = getGraphicsContext();
		//g.SetColor(color.red);
		//g.drawline(0,0,250,500);	
	}
	@Override
	public void processCommand(String command)                // this method must be provided because LBUGraphics will call it when
												              // it's JTextField is used
	{
		// String parameter is the text typed into the LBUGraphics JTextfield
		// lands here if return was pressed or "ok" JButton clicked
		// TO DO
		//about();
		getGraphicsContext().drawString("Hritick JHA", 250, 300);
		
		command = command.toLowerCase().replaceAll("\\s", " ").trim(); // cleaning up command
		String[] commands = command.split(" ");
		String val =" ";
		if(commands.length >1){
			val = commands[1];
		String[] params = command.split(" ");
	     command = params[0];
	     cycleColours();
	      if (command.equalsIgnoreCase("forward"))
	      forward(200);
	      if (command.equalsIgnoreCase("circle"))
	      circle(50);
	      if(command.equalsIgnoreCase("turnLeft"))
	      turnLeft(90);
	      if(command.equalsIgnoreCase("turnRight"))
	      turnRight(90);
	      if(command.equalsIgnoreCase("penDown"))
	      penDown();
	      if(command.equalsIgnoreCase("penUp"))
	      penUp();
	      if(command.equalsIgnoreCase("about"))
	      about();
	      if(command.equalsIgnoreCase("fill"))
	      {
	      Colour= 2;
	      try{
	      	fill();
	      	} catch (Exception e){
	      	//TODO Auto generated catch block
	      	 System.out.println("area too big "+e);
	      	 }
	      	 System.out.println("fill");
	      	}
	      	if(command.equalsIgnoreCase("red"))
	      	{
	      	setPenColour(Color.red);
	      	System.out.println("red");
	      	}
	      	if (command.equalsIgnoreCase("green"))
	      	setPenColour(Color.green);
	      	if (command.equalsIgnoreCase("blue"))
	      	setPenColour(Color.blue);
	      	if (command.equalsIgnoreCase("set"))
	      	{
	      	int degrees = Integer.parseInt(params[1]);
	      	pointTurtle(degrees);
	      	}
	      	System.out.println(direction);
	    }
		if (commands[0].equals("about")) {
				about();

		} else if (commands[0].equals("penup")) {
				penUp();
		} else if (commands[0].equals("pendown")) {
				penDown();
		} else if (commands[0].equals("turnleft")) {
				if (val == "") {
					displayMessage("No Parameters Passed");
		} else if (Integer.parseInt(val) < 0) {
					displayMessage("Parameters cannot be negative");
		} else {
					turnLeft(Integer.parseInt(val));
				}
		} else if (commands[0].equals("turnright")) {
				if (val == "") {
					displayMessage("No Parameters Passed");
		} else if (Integer.parseInt(val) < 0) {
					displayMessage("Parameters cannot be negative");
		} else {
					turnRight(Integer.parseInt(val));
				}
		} else if (commands[0].equals("forward")) {
				if (val == "") {
					displayMessage("No Parameters Passed");
				} 
				else if (Integer.parseInt(val) < 0) {
					displayMessage("Parameters cannot be negative");
				} else {
					forward(Integer.parseInt(val));
				}
			} else if (commands[0].equals("backward")) {
				if (val == "") {
					displayMessage("No Parameters Passed");
				}
				else if (Integer.parseInt(val) < 0) {
					displayMessage("Parameters cannot be negative");
				} 
				else {
					turnLeft(180);
					forward(Integer.parseInt(val));
				}
			} 
			else if (commands[0].equals("black")) 
			{
				setPenColour(Color.BLACK);
			} 
			else if (commands[0].equals("green"))
			{
				setPenColour(Color.GREEN);
			} 
			else if (commands[0].equals("red")) 
			{
				setPenColour(Color.RED);
			}
			else if (commands[0].equals("white")) {
				setPenColour(Color.WHITE);
			} 
			else if (commands[0].equals("reset"))
			{
				boolean penState = false;
				if (this.penDown) {
					penState = true;

				}

				reset();
				clear();
				turnRight(90);
				if (penState) {
					penDown();
				}

			} else if (commands[0].equals("clear")) {
				clear();
				clearInterface();
			}

			else {
				displayMessage("No Such Commands");
			}
		}
		//catch (Exception e) {
			//System.out.print(e);
			//if (e instance of NumberFormatException) {
				//displayMessage("Parameters should be a integer type");
			//}
			private void SetBackgroundColour(Color darkgray) {
			    	//TODO Auto-generated method stub
			    }
			 public void load() {
			    	BufferedImage image;
			    	try {
			    		image = ImageIO.read(new File("image.png"));
			    		setBufferedImage(image);
			    	} catch (IOException e) {
			    		//TODO AUTO -generated catch block
			    		e.printStackTrace();
			    	}
			    	repaint();
			   }
			 public void load2()
			    {
			    	String imagepath ="image.png";
			    	Image indexImage = Toolkit.getDefaultToolkit().getImage(imagepath);
			    	
			    	BufferedImage bufferedImage = getBufferedImage();
			    	Graphics g = bufferedImage.getGraphics(); //Graphics for the first object only
			    	//create a bufferedImage object from the loaded Image object
			    	//bufferedImage bufferedIndexImage = new BufferedImage(indexImage.getWidth(null),
			    	//indexImage.getHeight(null),BufferedImage.Type_int_ARGB);
			    	Graphics2D g2d = getGraphics2DContext();
			    	g2d.drawImage(indexImage,0,0,null);
			    	g2d.dispose();
			    	/*try{
			    	 //BufferedImage object Two
			    	  bufferedImage = ImageIO.read(getClass().getREsource("image.jpg"));
			    	  }catch (IOException e){
			    	   e.printStacKTrace();
			    	  }
			    	  setBufferedImage(bufferedImage);*/
			    	  repaint();
			    }
			 public void save() {
			    	File outputfile = new File("image.png");
			    	try {
			    		ImageIO.write(getBufferedImage(),"png",outputfile);
			    	}catch (IOException e) {
			    		//TODO auto-generated catch block
			    		e.printStackTrace();
			    	}
			 }
			 
		}

				
					