package InnerBeam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		System.out.println("________________");
	
	ApplicationContext container = new ClassPathXmlApplicationContext("innerBeam.xml");
	P a = (P)container.getBean("p");
	a.doSomeThing();
	
}}
