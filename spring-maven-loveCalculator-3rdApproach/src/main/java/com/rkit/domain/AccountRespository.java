package com.rkit.domain;

import java.util.ArrayList;
import java.util.List;

public interface AccountRespository {
	
	void storeAccount(Account acct);
	List<Account> getAllAccounts();
	void deleteAccount(int accNo);
	void updateAccount(Account acct);
	Account findAccount(int accno);
	

}
