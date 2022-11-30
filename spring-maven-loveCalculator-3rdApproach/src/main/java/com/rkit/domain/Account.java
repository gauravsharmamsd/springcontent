package com.rkit.domain;

public class Account {
	public Account(){
		System.out.println("Account object created ");
	}
	int accNo;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	Address addr;
	CustomerProfile customer;
	int balance;
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public CustomerProfile getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerProfile customer) {
		this.customer = customer;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}
