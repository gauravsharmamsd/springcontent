package bank.server.internal;

import bank.iserver.internal.service.AccountRepository;
import bank.server.Bank;

public class BankFactory {
public	AccountRepositoryImpl acctrepo;



	// ToDO provide factory method that takes Accountrepo as argument
	public Bank getInstance(AccountRepositoryImpl acctrepo) {
	
	System.out.println("promise day...");
		return new BankImpl(acctrepo);
	}

}
