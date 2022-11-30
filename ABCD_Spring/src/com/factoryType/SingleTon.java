package com.factoryType;

public class SingleTon {
//private static final SingleTon obj=new SingleTon();
SingleTon(){
	System.out.println("Default consructor called here....");
}
public static SingleTon getSingleTon() {
	System.out.println("Inside statuic method");
	return new SingleTon();
}
public   void displyMsg() {
	System.out.println("Welcome");

}
}
