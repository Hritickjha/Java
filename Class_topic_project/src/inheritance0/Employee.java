package inheritance0;

public class Employee {
	private String name;
	private int emp_id;
	
	public Employee(String name, int empid) {
		this.name = name;
		this.emp_id = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
}
