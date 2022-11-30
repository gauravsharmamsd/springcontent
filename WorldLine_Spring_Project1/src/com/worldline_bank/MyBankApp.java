package com.worldline_bank;

import java.util.List;

public class MyBankApp {
	private List<Bank>bank;
	public MyBankApp(List<Bank>bank) {
		System.out.println("inside MyBankApp constructor");
		this.bank=bank;
		System.out.println("inside MyBankApp constructor");
	}
	public List<Bank> getBank() {
		return bank;
	}
	@Override
	public String toString() {
		return "MyBankApp [bank=" + bank + "]";
	}
	public void setBank(List<Bank> bank) {
		this.bank = bank;
	}
	public MyBankApp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
//hdfc