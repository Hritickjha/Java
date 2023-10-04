package com_illisgton;

public class testlogger {

	public static void main(String[] args) {
		System.out.println("------singleton---------");
		
		logger obj1 = logger.getInstance();
		logger obj2 = logger.getInstance();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		System.out.println("-----non singleton-------");
		
		testlogger obj3 = new testlogger();
		testlogger obj4 = new testlogger();
		
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
	}

}
