package com.stu;

public class Student {
	private int RollNo;
	private String name;
	private String Address;
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String string) {
		this.name = string;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", name=" + name + ", Address=" + Address + "]";
	}
	
	
	
}
