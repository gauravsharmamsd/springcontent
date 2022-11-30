package com.worldline_bank;

public class Account {
	private String name;
	private int balance;
	public Account(String name, int balance) {
		super();
		this.name = name;
		this.balance = balance;
		System.out.println("Inside Account Constructor");
	}

	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + "]";
	}
	
}
