package com.worldline;

public class A {
      B b;
      String s;
      int i;
      
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public A(B b) {
		super();
		this.b = b;
		System.out.println("A created with parameterized Constructor with 1 param");
	}
	public A() {
		System.out.println("A created with Default COn");
		
	}
	public A(B b, String s , int i) {
		this.b = b;
		this.s = s;
		this.i = i;
		System.out.println("A created with parameterized Constructor with 3 params");
	}
	public String getS() {
		return this.s;
	}
	public void setS(String s) {
		this.s =s ;
	}
	
      
}
