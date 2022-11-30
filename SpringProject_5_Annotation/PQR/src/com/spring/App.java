package com.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Annotation.ConfigFile;



public class App {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
//		ApplicationContext ctp=new AnnotationConfigApplicationContext(Config.class);
//		ApplicationContext ctpp=new AnnotationConfigApplicationContext(Config.class);
//	Config sds=(Config) ctp.getBean("config");
//	Config sdss=(Config) ctp.getBean("config");
	SingletonDemo sd=(SingletonDemo) ctx.getBean("xyx");
	SingletonDemo sd2=(SingletonDemo) ctx.getBean("xyx");
//		Factory st =(Factory) ctx.getBean("rest");
	((Factory) st).getInstance();
//		sds.A();
//		sdss.A();
		System.out.println(sd);
		System.out.println(sd2);
//		System.out.println(sdss);
//		System.out.println(sds);
//		if(sds==sdss) {
//			System.out.println("same object....");
//		}
		if(sd==sd2) {
			System.out.println("same object....");
		}
		
	}

}
