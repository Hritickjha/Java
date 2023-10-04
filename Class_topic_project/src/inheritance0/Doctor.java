package inheritance0;

public class Doctor extends Employee{
private String spec;
	
	public Doctor(String name, int emp, String spec) {
		super(name,emp);
		this.spec = spec;
	}
	
	
	public void toprint_doctor() {
		System.out.println("Doctor "+ getName() + " Emp#" + getEmp_id() + " Specializes in " + spec );
	}
}
