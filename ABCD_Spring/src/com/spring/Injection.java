package com.spring;

import java.util.Scanner;

public class Injection {
	static Scanner sc =new Scanner(System.in);
public static int getPin() {
	System.out.println("Enter pin....");
	int pin =sc.nextInt();
	return pin;
}
public static String getCity() {
	System.out.println("Enter city....");
	String city =sc.next();
	return city;
}

public static String getState() {
	System.out.println("Enter state....");
	String state =sc.next();
	return state;
}
public static int getId() {
	System.out.println("Enter Id....");
	int id =sc.nextInt();
	return id;
}
public Injection() {
	super();
	// TODO Auto-generated constructor stub
}
public static String getColor() {
	System.out.println("Enter color....");
	String color =sc.next();
	return color;
}
public static String getName() {
	System.out.println("Enter name....");
	String name =sc.next();
	return name;
}


}
