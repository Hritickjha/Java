package inheritance0;

class Base{
	public Base() {
		System.out.println("I am base class contructor.");
	}
	public Base(int x) {
		System.out.println("I am base class contructor. and the value of x: "+ x);
	}
	public void toprint() {
		System.out.println("Hello i am base class.");
	}
}
class Derive extends Base{
	public Derive() {
		System.out.println("I am Derive class constructor.");
	}
	public Derive(int y) {
	super(y); // calling base class para-constructor 
		System.out.println("I am Derive class constructor. and the value of y: "+ y);
	}
	public void toprint1() {
		System.out.println("Hello i am derived class.");
	}
	
}

public class Inheritance {
	public static void main(String[] args) {
		Derive d1 = new Derive();
		Derive d2 = new Derive(10);
		
	}
}
