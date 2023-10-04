package polymorphism;
//********************************************************************
//Firm.java       Java Foundations
//
//Demonstrates polymorphism via inheritance.
//********************************************************************

public class Firm
{
	//-----------------------------------------------------------------
	   //  Creates a staff of employees for a firm and pays them.
	   //-----------------------------------------------------------------
	   public static void main(String[] args)
	   {
	      Staff personnel = new Staff();

	      personnel.payday();
	   }
}
