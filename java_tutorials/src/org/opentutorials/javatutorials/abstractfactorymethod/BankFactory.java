package org.opentutorials.javatutorials.abstractfactorymethod;

public class BankFactory extends AbstractFactory {
	public Bank getBank(String bank) {
		if (bank==null) {
			return null;
		}
		
		if (bank.equalsIgnoreCase("WooriBank")) {
			return new WooriBank();
		}
		else if (bank.equalsIgnoreCase("ShinhanBank")) {
			return new ShinhanBank();
		}
		else if(bank.equalsIgnoreCase("KookminBank")) {
			return new KookminBank();
		}
		return null;
	}
	
	public Loan getLoan(String loan) {
		return null;
	}

}
