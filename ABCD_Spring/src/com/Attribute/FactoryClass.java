package com.Attribute;

import java.util.Scanner;

public class FactoryClass {
public static Teacher getInstance() {
	Scanner sc =new Scanner(System.in);
	String s=sc.next();

	if(s.equals("MathTeacher")){
		return new MathTeacher();
	}
	return null;
	
}
}
