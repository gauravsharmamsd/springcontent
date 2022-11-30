import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bank.iserver.internal.service.AccountRepository;
import bank.server.Bank;
import bank.server.internal.Account;
import bank.server.internal.AccountRepositoryImpl;
import bank.server.internal.BankImpl;


public class TestBank {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
	
		
		ApplicationContext ctx =new ClassPathXmlApplicationContext("application-config.xml");
		
		AccountRepositoryImpl repo=new AccountRepositoryImpl();
		Bank bank=new BankImpl(repo);
		System.out.println(bank.withdraw(1380, 1234));
		//Bank bank1 = (Bank) ctx.getBean("bankService");
	
		
		Account acct1 = (Account) ctx.getBean("acct1");
		System.out.println(acct1.getName());
		System.out.println(acct1.getRate());
	
		

	  //  System.out.println(ctx.getClass().getName());
	
		
		
		

	}

}
