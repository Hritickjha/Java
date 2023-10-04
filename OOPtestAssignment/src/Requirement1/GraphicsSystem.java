package Requirement1;

import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import uk.ac.leedsbeckett.oop.LBUGraphics;

public class GraphicsSystem  extends LBUGraphics {
	public GraphicsSystem()
    {
            JFrame MainFrame = new JFrame();                //create a frame to display the turtle panel on
            MainFrame.setLayout(new FlowLayout());  //not strictly necessary
            MainFrame.add(this); 
            MainFrame.setSize(850,450);											//"this" is this object that extends turtle graphics so we are adding a turtle graphics panel to the frame
            MainFrame.pack();                                               //set the frame to a size we can see
            MainFrame.setVisible(true);                             //now display it
       
            //setStroke(10);
            //circle(150);
            //about();
            //penDown();
         
        //SetPencolor(color.green);
       //BufferedImage bufImg = getBufferedImage();
       //Graphics g = getGraphicsContext();
       //g.SetColor(color.red);
       //g.drawline(0,0,250,500);
            														//call the LBUGraphics about method to display version information.
    }
    @Override
    public void processCommand(String command)      //this method must be provided because LBUGraphics will call it when it's JTextField is used
    {
    	//String parameter is the text typed into the LBUGraphics JTextfield
    	//lands here if return was pressed or "Ok" JButton clicked
    	//TO DO
    	about();
    	getGraphicsContext().drawString("Hritck Jha" ,250, 300);
    	
    	command = command.toLowerCase();
    	String[] sut = command.split(" ");
    	int parameter =0;
    	String cmd = sut[0];
    	if(sut.length>1) {
    		try {
    			parameter = Integer.parseInt(sut[1]);
    			}catch(NumberFormatException e) {
    				return;
    			}
    		 String[] params = command.split(" ");
    	     command = params[0];
    	     //cycleColour();
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
    	switch(cmd)
    	{
    	case"pendown":
    		penDown();
    		break;
    	case"penup":
    		penUp();
    		break;
    	case"forward":
    		forward(parameter);
    		break;
    	case"reset":
    		reset();
    		break;
    	case"left":
    		turnLeft();
    		break;
    	case"right":
    		turnRight();
    		break;
    	case"load":
    		load();
    		break;
    	case"save":
    		save();
    		break;
    	case"clear": //SetBackground_col(color.green);
    		clear();
    		break;
    	case"circle":
    		circle(parameter);
    		break;
    	case"about":
    		about();
    		break;
    	case"pont":
    		pointTurtle(parameter);
    		break;
    	default:
    		System.out.println("unkown");
    	}
    	System.out.println("command = "+command);
    }
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
    public void load2() {
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