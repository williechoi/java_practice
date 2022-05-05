package org.opentutorials.javatutorials.abstractfactorymethod;

public class KookminBank implements Bank {
	private final String BNAME;
	
	public KookminBank() {
		BNAME = "KookminBank";
	}
	
	public String getBankName() {
		return BNAME;
	}

}
