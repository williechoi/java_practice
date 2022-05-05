package org.opentutorials.javatutorials.abstractfactorymethod;

public class ShinhanBank implements Bank {
	private final String BNAME;
	
	public ShinhanBank() {
		BNAME = "ShinhanBank";
	}
	
	public String getBankName() {
		return BNAME;
	}

}
