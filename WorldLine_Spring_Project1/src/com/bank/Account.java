package com.bank;

public class Account {

	String name;
	int acno;
	int bal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAcno() {
		return acno;
	}
	public Account(String name, int acno, int bal) {
		super();
		this.name = name;
		this.acno = acno;
		this.bal = bal;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public Account() {
		super();
		System.out.println("Account constructor generated");
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
}
