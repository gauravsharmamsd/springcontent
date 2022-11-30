package com.bank;

import java.util.List;

public class BankApplication {

	List<Bank> list;

	public List<Bank> getBankList() {
		return list;
	}
	public void setBankList(List<Bank> bank) {
		this.list = bank;
	}

	public BankApplication(List<Bank> bank) {
		super();
		this.list = bank;
		System.out.println("BAnkAplication Constructor is created"+list.getClass());
	}
	
	
}
