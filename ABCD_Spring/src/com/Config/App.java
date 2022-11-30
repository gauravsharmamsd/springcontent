package com.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class App {

	public static void main(String[] args) throws InterruptedException {
		
	//	ApplicationContext ctp=new AnnotationConfigApplicationContext(Configs.class);
		AnnotationConfigApplicationContext ctp = new AnnotationConfigApplicationContext();
		ctp.register(Configs.class);
		ctp.refresh();
       College clg= ctp.getBean("college",College.class);
       clg.A();

	
	}

}
