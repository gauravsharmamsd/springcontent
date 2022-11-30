package com.Xml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rkit.Pune;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("xmlTpe.xml");
		
//		ApplicationContext ctx=new AnnotationConfigApplicationContext(ConfigFile.class);
	College c=(College) ctx.getBean("college");
	c.doSimething();
	
	
	
//		System.out.println("College obj created... ");
//		c.doSimething();
//		College c1=new College();
//		Principal p=new Principal();
//		p.principalInfo();
//	 
//		FactoryClass f=new FactoryClass();
//		f.getInstance().teach();
		
		//c.doSimething();
//	    ((AbstractApplicationContext) ctx).close();
	}

}
