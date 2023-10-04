package Designing_Classes;

public class Die {
	private final int MAX = 6;  // maximum face value
	   private int faceValue;  // current value showing on the die
	   public Die()
	   {
	      faceValue = 1;
	   }
	   public int roll()
	   {
	      faceValue = (int)(Math.random() * MAX) + 1;
	      return faceValue;
	   }		
	 public void setFaceValue(int value)
	   {
	      if (value > 0 && value <= MAX)
	         faceValue = value;
	   }
	public int getFaceValue()
	   {
	      return faceValue;
	   }
	//-----------------------------------------------------------------
	   //  Returns a string representation of this die.
	   //-----------------------------------------------------------------
	   public String toString()
	   {
	      String result = Integer.toString(faceValue);

	      return result;
	   }
	}	

