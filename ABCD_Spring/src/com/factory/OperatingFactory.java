package com.factory;

import java.util.Scanner;

public class OperatingFactory {
	public OperatingFactory() {
		System.out.println("Defaiult constructpr vcsalled");
	}
public OS getInstance() {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter name");
	String str=sc.next();
	if(str.equals("IOS")) {
		return new IOS();
	}
	if(str.equals("Window")) {
		return new Window();
	}
	return new Android();
}
}
