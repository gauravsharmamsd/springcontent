package com.bank;

import java.util.Set;

public class HDFC implements Bank {
	static String name="HDFC";
	public String getBankName() {
		return name;
	}
	Set<Account> set;
	
	@Override
	public Set<Account> getSet() {	
		return set;
	}


	public void setSet(Set<Account> set) {
		this.set = set;
	}

	String branch;
	
	@Override
	public String getBr() {
		// TODO Auto-generated method stub
		return branch;
	}
	
	public void setBranch(String branch) {
		this.branch = branch;
	}

	
	public HDFC() {
		super();
		System.out.println("Default HDFC");
	}

	public HDFC(Set<Account> act) {
		
		this.set = act;
		System.out.println("HDFC Created with Account as parameter"+act.getClass());
	}

	@Override
	public void openAccount() {
		System.out.println("Account Opend");
		
	}

	@Override
	public void withDraw() {
		System.out.println("Withdrawing Money done");
		
	}


	


}
