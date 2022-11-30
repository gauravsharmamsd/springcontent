package com.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class A {
	@Value("Ms Dhoni")
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	private B b;

	private I i;
public B getB() {
		return b;
	}
public A(B b) {
	this.b=b;
}
	public A(I i) {
	super();
	this.i = i;
}
	public void setB(B b) {
		this.b = b;
	}
public void A() {
	b.p();
	i.teach();
	
	System.out.println("A method called "+name);
}
public I getI() {
	return i;
}
public void setI(I i) {
	this.i = i;
}
public A(){
	System.out.println("Default constructor called");
}
}
