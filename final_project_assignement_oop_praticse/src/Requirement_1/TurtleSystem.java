package Requirement_1;
import java.awt.FlowLayout;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class TurtleSystem extends LBUGraphics{
	int parameter;
	int choice;
	BufferedImage newImage;
	BufferedImage img;
	boolean flag;
	boolean modified;
	List<String> parameterCommands;
	Graphics Graphics = getGraphicsContext();

	public TurtleSystem()
	{
		JFrame mainFrame = new JFrame(); // create a frame to display the turtle panel on
		InitialiseJFrame(mainFrame); // initialise the Jframe
		InitialiseCommandsList();
	}
	private void InitialiseJFrame(JFrame mainFrame) // method used to initialise Jframe
	{
		mainFrame.setLayout(new FlowLayout()); // not strictly necessary
		mainFrame.add(this); // "this" is this object that extends turtle graphics so we are adding a turtle
								// graphics panel to the frame
		mainFrame.pack(); // set the frame to a size we can see
		mainFrame.setVisible(true); // now display it
		turnLeft(90);
		penDown();
	}

	private void InitialiseCommandsList() // list of commands that only work with a parameter
	{
		parameterCommands = Arrays.asList("forward", "backward", "circle", "colour");
	}

	public void processCommand(String command)
	{
		command = command.toLowerCase();
		if (command.contains(" ") & (!(command.isBlank())))
		{
			String[] parts = command.split(" ");
			int size = parts.length;
			command = parts[0];
			if ((size > 1 & size < 3) & (command.intern() != "colour"))
			{
				if (checkForInteger(parts[1]))
				{
					parameter = Integer.parseInt(parts[1]);
					if (parameter > 0)
					{
						chooseCommandParameter(command, parameter);
					} else
					{
						displayMessage("Parameter value must be positive!");
					}
				}
			} else
			{
				flag = validateColourCommand(size, command, parts);
				if (!flag)
				{
					displayMessage("Invalid command!");
				}
			}
		} else
		{
			if (parameterCommands.contains(command))
			{
				displayMessage("Command requires parameter to work");
			} else
			{
				chooseCommand(command);
			}
		}
	}

	public boolean checkForInteger(String possibleParameter)
	{
		if (possibleParameter.matches("-?[0-9]+"))
		{
			return true;
		}
		displayMessage("Only numeric data allowed for use as parameters!");
		return false;
	}

	public boolean validateColourCommand(int size, String command, String[] parts)
	{
		if ((size == 4) & (command.intern() == "colour"))
		{
			if (checkForInteger(parts[1]) & checkForInteger(parts[2]) & checkForInteger(parts[3]))
			{
				int r1 = Integer.parseInt(parts[1]);
				int r2 = Integer.parseInt(parts[2]);
				int r3 = Integer.parseInt(parts[3]);
				if ((r1 > -1 & r1 < 256) & (r2 > -1 & r2 < 256) & (r3 > -1 & r3 < 256))
				{
					setRGBColour(r1, r2, r3);
					return true;
				}
			}
		}
		return false;
	}

	public void chooseCommandParameter(String command, int parameter)
	{
		modified = true;
		switch (command)
		{
		case "turnleft":
			turnLeft(parameter);
			break;
		case "turnright":
			turnRight(parameter);
			break;
		case "forward":
			forward(parameter);
			break;
		case "backward":
			forward(-parameter);
			break;
		case "circle":
			circle(parameter);
			break;
		default:
			displayMessage("Invalid command!");
		}
	}

	public void chooseCommand(String command)
	{
		if (command.intern() != "load" & command.intern() != "reset" & command.intern() != "new")
		{
			modified = true;
		}
		switch (command)
		{
		case "about":
			about();
			break;
		case "penup":
			penUp();
			break;
		case "pendown":
			penDown();
			break;
		case "reset":
			reset();
			turnLeft();
			penDown();
			displayMessage("TurtleGraphics V2.0");
			break;
		case "new":
			setBackground_Col(Color.black);
			clear();
			displayMessage("TurtleGraphics V2.0");
			break;
		case "blue":
			setPenColour(Color.blue);
			break;
		case "green":
			setPenColour(Color.green);
			break;
		case "red":
			setPenColour(Color.red);
			break;
		case "white":
			setPenColour(Color.white);
			break;
		case "save":
			SaveImage();
			break;
		case "load":
			LoadImage();
			break;
		case "turnleft":
			turnLeft();
			break;
		case "turnright":
			turnRight();
			break;
		default:
			displayMessage("Invalid command!");
		}
	}

	public void SaveImage()
	{
		modified = false;
		String imageName = (String) JOptionPane.showInputDialog(null, "Type image name here", "Save image");
		if (imageName != null)
		{
			try
			{
				newImage = getBufferedImage();
				File outputfile = new File(imageName + ".jpg");
				if (outputfile.isFile())
				{
					OverwriteImage(outputfile);
				} else
				{
					ImageIO.write(newImage, "jpg", outputfile);
				}

			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	public void OverwriteImage(File outputfile)
	{
		Object[] options =
		{ "Yes, overwrite image", "Cancel" };
		int choice = JOptionPane.showOptionDialog(null,
				"An image with this name has already exists, would you like to overwrite it?", "Warning",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
		if (choice == 0)
		{
			try
			{
				ImageIO.write(newImage, "jpg", outputfile);
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}

	}

	public void LoadImage()
	{
		if (modified == true)
		{
			LoadwithoutSaving();
		}

		String loadImage = (String) JOptionPane.showInputDialog(null, "Type image name here", "Load image");
		File isNameValid = new File(loadImage + ".jpg");

		if (loadImage != null)
		{
			if (isNameValid.isFile())
			{
				try
				{
					img = ImageIO.read(new File("C:\\Users\\spiro\\eclipse-workspace\\Assignment\\" + loadImage + ".jpg"));
					setBufferedImage(img);
				} catch (IOException e)
				{
					e.printStackTrace();
				}
				modified = false;
			} else
			{
				JOptionPane.showMessageDialog(null, "No images exist with this name", "Error", 0);
			}
		}
	}

	public void LoadwithoutSaving()
	{
		Object[] options =
		{ "Yes, I would like to save first.", "No, load without saving", "Cancel" };

		choice = JOptionPane.showOptionDialog(null,
				"You are attempting to load an image without saving the current one. Would you like to save the current image first?",
				"Warning", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

		if (choice == 0)
		{
			SaveImage();
		}
	}

	public void circle(int radius)
	{
		Graphics.setColor(getPenColour());
		Graphics.drawOval(400, 120, radius, radius);
	}

	@Override
	public void about()
	{
		Color initialColour = getPenColour();
		Graphics.setColor(Color.orange);
		Graphics.drawString("Welcome to Turtle Graphics Version 2.0!", 50, 200);
		for (int i1 = 0; i1 < 7; i1++)
		{
			int randomNum1 = ThreadLocalRandom.current().nextInt(0, 256);
			int randomNum2 = ThreadLocalRandom.current().nextInt(0, 256);
			int randomNum3 = ThreadLocalRandom.current().nextInt(0, 256);
			setRGBColour(randomNum1, randomNum2, randomNum3);
			setxPos(450);
			setyPos(200);
			for (int i2 = 0; i2 < 7; i2++)
			{
				forward(100);
				turnRight(60);

			}
		}
		Graphics.drawRect(425, 75, 50, 250);
		Graphics.drawRect(325, 175, 250, 50);
		setPenColour(initialColour);
	}
	public void setRGBColour(int r1, int r2, int r3)
	{
		Color rgb = new Color(r1, r2, r3);
		setPenColour(rgb);
	}
}
