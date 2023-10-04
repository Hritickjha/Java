package com_illisgton;

public class logger {
	
	private static logger logger;
	
	private logger() {
		
	}
	
	public  static logger getInstance() {
		if (logger == null) {
			logger = new logger();		
			}
			return logger;

	}


}
