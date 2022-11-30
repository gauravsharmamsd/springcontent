package com.rkit.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bank {
	@Autowired
	AccountRespository repo;
	List<Account> showAllAccounts(){
		return repo.getAllAccounts();
	}
	public void createAccount(Account acct) throws InsufficientFundsException{
		if(acct.getBalance() <1000){
			throw new InsufficientFundsException("Min Balance must be 1000");
		}
		repo.storeAccount(acct);
	}
	public void withdraw(int accNo, int amount) throws AccountNotFoundException, InsufficientFundsException{
		Account acct = repo.findAccount(accNo);
		if(acct==null)
			throw new AccountNotFoundException("Pl. check account Number you entered");
		if(acct.getBalance()<(amount+1000)){
			throw new InsufficientFundsException("Min Balance must be 1000");
		}
		acct.setBalance(acct.getBalance()-amount);
		repo.updateAccount(acct);
	}
	public void deposit(int accNo, int amount) throws AccountNotFoundException{
		Account acct = repo.findAccount(accNo);
		if(acct==null)
			throw new AccountNotFoundException("Pl. check account Number you entered");
		
		acct.setBalance(acct.getBalance()+amount);
		repo.updateAccount(acct);
	}
	public void closeAccount(int accNo) throws AccountNotFoundException{
		Account acct = repo.findAccount(accNo);
		if(acct==null)
			throw new AccountNotFoundException("Pl. check account Number you entered");		
		repo.deleteAccount(accNo);
	}

}
