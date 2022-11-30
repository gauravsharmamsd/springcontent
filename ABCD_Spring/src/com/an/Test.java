package com.an;
import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		BeanFactory beanFactory = new BeanFactory();
		Bank bank = beanFactory.getBean("hdfc");
		bank.openAccount();
		bank.withdraw();
	}

}
class BeanFactory{
	public Bank getBean(String id) {
		Bank bank = null;
		if(id.equals("hdfc")) {
			bank =  new HDFCBank();
		}else if(id.equals("sbi")) {
			bank =  new SBIBank();
		}
		//Dynamic Proxy creation using JDK Proxy class. Nothing to do with Spring
		return (Bank)Proxy.newProxyInstance(bank.getClass().getClassLoader(), new Class[]{Bank.class}, new LoggingAspect(bank));
	}
}
