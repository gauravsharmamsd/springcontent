package com.worldline_bank;

public class SBIBank implements Bank{
	
	Account acct;
	public SBIBank(Account acct) {
		// TODO Auto-generated constructor stub
		this.acct=acct;
		System.out.println("Inside SBIBank constructor");
	}

	@Override
	public Account openAccount() {
		System.out.println("Account opened in ...SBI");
		return acct;
		
	}

	@Override
	public String toString() {
		return "SBIBank [acct=" + acct + "]";
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdrawal done on SBI");
		
	}

}
