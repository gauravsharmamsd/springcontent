package com.Xml;

import org.springframework.stereotype.Component;

//@Component("abc")
public class College {
	private Principal p;
	private Teacher t;
	
public Teacher getT() {
		return t;
	}

	public void setT(Teacher t) {
		this.t = t;
	}

	public Principal getP() {
		return p;
	}

public College(Principal p) {
		
		this.p = p;
	}
College(){
	System.out.println("College default Constructor called....means bject created");
}

public void setP(Principal p) {
	this.p = p;
}
void doSimething() {
	//p.principalInfo();
	t.teach();
	System.out.println("Hi spring......");
}
}
