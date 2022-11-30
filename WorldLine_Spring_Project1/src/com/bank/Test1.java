package com.bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("spring-bank-config.xml");	
		
		BankApplication ba=(BankApplication) springContainer.getBean("bankAppIC");
		
		for (Bank bk : ba.getBankList()) {
			System.out.println("-----------------------");
			System.out.println("BankName: "+bk.getBankName());
			System.out.println("Branch: "+bk.getBr());
			bk.openAccount();
			bk.withDraw();
			for (Account account : bk.getSet()) {
				System.out.println("-----------------------");
				System.out.println("HolderName: "+account.getName()+" \nAcno: "+account.getAcno()+" \nBal: "+account.getBal());
				System.out.println("-----------------------");
			}
			System.out.println("-----------xoxo------------");
		}
		
//		ba.getBank().openAccount();
//		ba.getBank().withDraw();
//		Account account=ba.getBank().getAccount();
//		System.out.println("AccountName: "+account.getName()+" \nAcno: "+account.getAcno()+" \nBal: "+account.getBal());
//		BankApplication ba1=(BankApplication) springContainer.getBean("bankAppIC");
//		ba1.getBank().openAccount();
//		ba1.getBank().withDraw();
//		Account account1=ba1.getBank().getAccount();
//		System.out.println("AccountName: "+account1.getName()+" \nAcno: "+account1.getAcno()+" \nBal: "+account1.getBal());
	}
}
