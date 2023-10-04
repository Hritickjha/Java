package basicconcept;

public class test {
	
	public static void main(String[] args) {
		
		System.out.println("aobj");
		/*
		System.out.println("bobj");
		B bobj = new B();
		bobj.methodA();
		bobj.methodB();*/
		
		
//	system.out.println("A or B?");
		//superclass obj= new subclass();
		int x = 10;
		A obj = new B();
		obj.methodA();
		obj.methodB();
		
		//not possible
		//B obj2 = new A();
	}

}
