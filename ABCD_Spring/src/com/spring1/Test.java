package com.spring1;

public class Test {
int num1=10;
int num2=15;
public Test(int num1,int num2) {
	System.out.println("Default constructor called....");
	this.num1=num1;
	this.num2=num2;
}
@Override
public String toString() {
	return "[num1,num2]";
	
}
public int x() {
	return 5;
}
}
