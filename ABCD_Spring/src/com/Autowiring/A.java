package com.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("abc")
public class A {
	@Autowired
	B b;
	

//	public A(B b) {
//		super();
//		System.out.println("parametrxed constructor"+b);
//		this.b = b;
//	}
	public A() {
		System.out.println("default of A");
	}
//	public void setB(B b) {
//		this.b = b;
//	}
	void m1() {
		System.out.println(b);
		b.m();
		System.out.println("m1 of class A called");
	}

}
