package inheritance0;

public class Nurse extends Employee{
private int patient;
	
	public Nurse(String name, int emp, int patient) {
		super(name,emp);
		this.patient = patient;
	}
	public void toprint_Nurse() {
		System.out.println("Nurse "+ getName()+ " Emp#" + getEmp_id() + " has " + patient + " Patient" );
	}
}
