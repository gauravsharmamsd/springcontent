package com.rkit;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class X {
	String s;
	Y y;
	X(Y y, String s){
		System.out.println("X created");
		this.y = y;
		this.s = s;
	}
	@PostConstruct
	void init1() {
		System.out.println("X init1");
	}
	@PostConstruct
	void init2() {
		System.out.println("X init2");
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public Y getY() {
		return y;
	}

	public void setY(Y y) {
		this.y = y;
	}
	

}
