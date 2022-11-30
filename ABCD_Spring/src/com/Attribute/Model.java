package com.Attribute;

import org.springframework.stereotype.Component;

@Component
public class Model {
int x;
String p;
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public String getP() {
	return p;
}
public void setP(String p) {
	this.p = p;
}
public Model(int x, String p) {
	super();
	this.x = x;
	this.p = p;
}
@Override
public String toString() {
	return "Model [x=" + x + ", p=" + p + "]";
}
public Model() {
	super();
	System.out.println("Constructor called");
	// TODO Auto-generated constructor stub
}
}
