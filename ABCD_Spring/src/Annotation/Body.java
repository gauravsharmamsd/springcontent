package Annotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Employee;

public class Body {
	public static void main(String[] args) {
		
	
	ApplicationContext springContainer = new ClassPathXmlApplicationContext("human.xml");
	
	Human human=(Human) springContainer.getBean("human");
	//human.setHeart(null);
	human.startPump();

}}
