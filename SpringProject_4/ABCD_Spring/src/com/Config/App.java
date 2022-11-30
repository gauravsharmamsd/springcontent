package com.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Annotation.ConfigFile;



public class App {

	public static void main(String[] args) throws InterruptedException {
		
		ApplicationContext ctp=new AnnotationConfigApplicationContext(Configs.class);
       A c=  (A) ctp.getBean("obj");

       c.A();

		
	}

}
