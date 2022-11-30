package com.rkit.domain;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class AccountRepositoryImpl implements AccountRespository {
	private List<Account> accounts = new ArrayList<Account>();
	@Override
	public void storeAccount(Account acct) {
		accounts.add(acct);
	}
	@Override
	public List<Account> getAllAccounts() {
		return accounts;
	}
	@Override
	public void deleteAccount(int accNo) {
		for(Account acct : accounts){
			if(acct.getAccNo()==accNo){
				accounts.remove(acct);
			}
		}
	}
	@Override
	public void updateAccount(Account account) {
		for(Account acct : accounts){
			if(acct.getAccNo()==account.getAccNo()){
				accounts.remove(acct);
				accounts.add(account);
			}
		}
	}
	@Override
	public Account findAccount(int accno) {
		for(Account acct : accounts){
			if(acct.getAccNo()==accno){
				return acct;
			}
		}
		return null;
	}
}
