package bank.server.internal;

import static java.lang.String.format;

import java.util.HashSet;
import java.util.Set;

import bank.iserver.internal.service.AccountRepository;

public class AccountRepositoryImpl implements AccountRepository {

	@Override
	public String toString() {
		return "AccountRepositoryImpl [accounts=" + accounts + "]";
	}
	Set<Account> accounts = new HashSet<Account>();
	public AccountRepositoryImpl() {
		System.out.println("DEBUG : Account Repository created");
	   Account acct1 = new Account(100, "Vivek", 1234);
	   accounts.add(acct1);
	   Account acct2 = new Account(200, "Krishna", 12345);
	   accounts.add(acct2);
	   Account acct3 = new Account(300, "Shriram", 123456);
	   accounts.add(acct3);
	}
	@Override
	public Account findAccountByAcctNumber(int acctNo) {
		for(Account acct : accounts){
			if( acct.getAcctNo() == acctNo)
			return acct;
		}
		return null;
	}
	public  Account createAccount(String name, int balance, int acctNo){
		return new Account(balance,name,acctNo);
	}

}
