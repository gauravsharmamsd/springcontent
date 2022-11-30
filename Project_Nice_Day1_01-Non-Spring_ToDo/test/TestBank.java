

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
	 * 
	 */
   
	//String abc=sc.next();
	//static Polygon p= (Polygon) ObjectCreation.get(abc);
	
	public static void main(String[] args) {
		//TODO 1 Create Bank object and call withdraw method print and see the output
		
		AccountRepositoryImpl repo=new AccountRepositoryImpl();
	System.out.println(repo.getAccounts());
	
	System.out.println(repo);
	
		Bank bank=new BankImpl(repo);
	
		System.out.println(bank.withdraw(138, 12345));
		
		 
		  }
		
		

	}


