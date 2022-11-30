package com.worldline;

public class B {
	C c;
	D d;
	String str;
	B(C c, D d){
		this.c = c;
		this.d = d;
		System.out.println("B Created with 2 params");
	}
	B(C c, D d, String s){
		this.c = c;
		this.d = d;
		this.str = s;
		System.out.println("B Created with 3 params");
	}

	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
}
