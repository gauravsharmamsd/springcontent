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
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("application-config.xml");
		//TODO 
		//Get application context , call getBean method and invoke withdraw on
		// bank bean
		AccountRepositoryImpl repo=new AccountRepositoryImpl();
		Bank bank=new BankImpl(repo);
		System.out.println(bank.withdraw(1380, 1234));

	}

}
