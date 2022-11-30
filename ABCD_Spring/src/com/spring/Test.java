package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
//		Address addr1=new Address(1,"kanpur","up");
//		Employee ee=new Employee("suraj",15,"black",addr1);
//		System.out.println(ee+" "+addr1);

		
		
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("emp.xml");
		
		Employee emp1=(Employee) springContainer.getBean("employee");
		
	EmpStore estore =new EmpStore();
	estore.setEe(emp1);
	System.out.println(estore.getEe());
	
}
		
	

}
