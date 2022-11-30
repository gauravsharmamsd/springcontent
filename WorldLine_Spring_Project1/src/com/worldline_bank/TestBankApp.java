package com.worldline_bank;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBankApp {
	public static void main(String[] args) {
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("Bank.xml");
	
		MyBankApp Bank =(MyBankApp)springContainer.getBean("javaCollection");
		System.out.println(Bank);
//		
//		List<Bank> b=Bank.getBank();
//		for(int i=0;i<b.size();i++) {
//  	 
//        b.get(i).openAccount();
//        b.get(i).withdraw();
//		
//		 
//		 System.out.println(b.get(i));
//		}

		 
//		//System.out.println(b);
//		Account act=hdfcBank.getBank().openAccount();
//		int p=act.getBalance();
//		System.out.println(p);
//		Bank bb=sbiBank.getBank();
//		bb.openAccount();
//		bb.withdraw();
//		System.out.println(""+bb);
//		
		
		//Bank c=new HDFC();
		
		
		
		
		
	}
}
