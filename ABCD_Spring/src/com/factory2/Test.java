package com.factory2;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
ApplicationContext ctx = new ClassPathXmlApplicationContext("fact1.xml");

ATM atm=(ATM) ctx.getBean("atm");
atm.bal(5);

//	OperatingFactory op =new OperatingFactory();
//	OS obj=op.getInstance("Window");
////OS obj=new Window();
//obj.spec();
}
}
