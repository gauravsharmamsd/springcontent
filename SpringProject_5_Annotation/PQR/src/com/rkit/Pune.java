package com.rkit;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("xyz")//create object and xyz is id here
@Scope("singleton")
@Lazy
public class Pune {
	Q q;
	String s;
	
	public Q getQ() {
		return q;
	}
	@Autowired   //<property ref="q">
	public void setQ(Q q) {
		this.q = q;
		System.out.println("Set Q called");
	}
	public String getS() {
		return s;
	}
	@Autowired //<property value="Hello">
	public void setS(@Value("Hello")String s) {
		this.s = s;
		System.out.println("SetS called value is "+s);
	}
    
	Pune(){ 
		System.out.println("Pune created using default");
	}
	
	Pune(Q q){ //<constructor-arg ref="q"></constructor-arg>
		this.q = q;
		System.out.println("Pune created with parameterized");
	}
	
	Pune(@Value("Hello")String s){ //<constructor-arg ref="q"></constructor-arg>
		this.q = q;
		System.out.println("Pune created with parameterized");
	}
	@Autowired
	Pune(Q q,@Value("Namaste")String s){ //<constructor-arg ref="q"></constructor-arg>
		this.q = q;
		System.out.println("Pune created with parameterized with Q and "+s);
	}
	
	
	public void sayHello() {
		System.out.println("Hello from P");
	}
	@PostConstruct //init-method=hi 
	public void hi() {
		System.out.println("Hi from Init");
	}
	@PreDestroy //destroy-method
	public void reset() {
		System.out.println("About to detsroy the bean");
	}

}
/*
 * <bean id="p" class="P">
 * <constrcutor-arg ref="q">
 * </bean>
 */
