package com.worldline_bank;

public class HDFCBank implements Bank{
	
	Account acct;
	public HDFCBank(Account acct) {
		// TODO Auto-generated constructor stub
		this.acct=acct;
		System.out.println("Inside HDFCBank constructor");
	}
	@Override
	public Account openAccount() {
		
		System.out.println("Account open...in hdfc");
		return acct;
		
	}

	@Override
	public String toString() {
		return "HDFCBank [acct=" + acct + "]";
	}
	@Override
	public void withdraw() {
		System.out.println("Withdraw...");
		
	}

}
