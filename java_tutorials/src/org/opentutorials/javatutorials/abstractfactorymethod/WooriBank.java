package org.opentutorials.javatutorials.abstractfactorymethod;

public class WooriBank implements Bank {
	private final String BNAME;
	
	public WooriBank() {
		BNAME = "WooriBank";
	}
	
	public String getBankName() {
		return BNAME;
	}

}
