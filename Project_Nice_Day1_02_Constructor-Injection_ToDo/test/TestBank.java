import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.worldline_bank.MyBankApp;

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
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("application-config.xml");
//		a. Get ApplicationContext
//		b. getBean (Bank bean)
//		c. call withdraw method
//		d. Make sure that it works
		AccountRepository a=new AccountRepositoryImpl();
		BankImpl b =new BankImpl(a);
	
		b.withdraw(50, 1234);
		
	//	Bank bank=(BankImpl) springContainer.getBean("bankService");
		System.out.println(b.withdraw(20, 12345));
//		
////		Bank bank =new BankImpl(new AccountRepositoryImpl())
////		System.out.println(bank);
	}

}
