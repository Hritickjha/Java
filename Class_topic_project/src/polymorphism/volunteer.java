package polymorphism;
//********************************************************************
//Volunteer.java       Java Foundations
//
//Represents a staff member that works as a volunteer.
//********************************************************************

public class volunteer extends StaffMember {
	//-----------------------------------------------------------------
	   //  Constructor: Sets up this volunteer using the specified
	   //  information.
	   //-----------------------------------------------------------------
	   public volunteer(String eName, String eAddress, String ePhone)
	   {
	      super(eName, eAddress, ePhone);
	   }

	   //-----------------------------------------------------------------
	   //  Returns a zero pay value for this volunteer.
	   //-----------------------------------------------------------------
	   public double pay()
	   {
	      return 0.0;
	   }
	}