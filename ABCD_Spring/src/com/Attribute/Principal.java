package com.Attribute;

public class Principal {
public void principalInfo() {
	System.out.println("im the principal");
}
public static Principal getInstance() {
	System.out.println("im the principal");
	return new Principal() ;
}


public Principal() {
	super();
	// TODO Auto-generated constructor stub
}
}
