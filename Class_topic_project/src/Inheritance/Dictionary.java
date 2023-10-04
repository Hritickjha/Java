package Inheritance;

public class Dictionary extends Book2 {
	private int definitions;
	   //-----------------------------------------------------------------
	   //  Constructor: Sets up the dictionary with the specified number
	   //  of pages and definitions.
	   //-----------------------------------------------------------------
	   public Dictionary(int numPages, int numDefinitions)
	   {
	      super(numPages); //call to constructor of super class (book2)

	      definitions = numDefinitions;
	   }
	     public double computeRatio()
	   {
	      return definitions/pages;
	   }	
	   public void setDefinitions(int numDefinitions)
	   {
	      definitions = numDefinitions;
	   }
	   public int getDefinitions()
	   {
	      return definitions;
	   }
	}		
