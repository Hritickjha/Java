package abstract0;

abstract class Base{
	public void greet(){
		System.out.println("Hello !");
	}
	abstract public void greet1();
}

class Drive extends Base{

	@Override
	public void greet1() {
		System.out.println("Hello, Good Morning!");	
	}
}

public class class_abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Base b1 = new Base(); -- error
		Base b2 = new Drive();
		
		Drive d1 = new Drive();
		
		b2.greet();
		b2.greet1();
		
		d1.greet();
		d1.greet1();
	}

}
