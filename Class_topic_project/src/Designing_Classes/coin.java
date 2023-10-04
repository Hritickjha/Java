package Designing_Classes;

public class coin {
	private final int HEADS = 0;  // tails is 1

	   private int face;  // current side showing
	   public coin()
	   {
	      flip();
	   }	
	   public void flip()
	   {
	      face = (int) (Math.random() * 2);
	   }
	   public boolean isHeads()
	   {
		  if (face == HEADS)
	         return true;
	      else
	         return false;
	   }
	}

