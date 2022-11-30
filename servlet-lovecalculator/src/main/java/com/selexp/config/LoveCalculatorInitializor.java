package com.selexp.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorInitializor implements WebApplicationInitializer {

	
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("my custom class startup method....gaurav");
		
		AnnotationConfigWebApplicationContext applicationContext=new AnnotationConfigWebApplicationContext();
		applicationContext.register(LoveCalculatorAppConfig.class);
		
		
//		XmlWebApplicationContext applicationContext = new XmlWebApplicationContext();
//		applicationContext.setConfigLocation("classpath:app-config.xml");

		// create a dispatcherServlet & register with servletContext obj
		DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);
		ServletRegistration.Dynamic registration = servletContext.addServlet("mydispatcherServlet", dispatcherServlet);
		System.out.println("hiii");
		registration.setLoadOnStartup(1);
		registration.addMapping("/");

	}

}
