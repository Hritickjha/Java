package inheritance0;

public class cleaner extends Employee{
	private String dept;
	public cleaner(String name, int emp, String dept) {
		super(name,emp);
		this.dept = dept;
	}
	public void toprint_Cleaner() {
		System.out.println("Cleaner "+ getName()+ " Emp#" + getEmp_id() + " of " + dept + " is sweeping" );
	}
}
