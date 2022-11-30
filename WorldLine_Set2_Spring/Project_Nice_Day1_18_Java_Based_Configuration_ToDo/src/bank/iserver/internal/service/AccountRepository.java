package bank.iserver.internal.service;

import bank.server.internal.Account;

public interface AccountRepository {
	Account findAccountByAcctNumber(int acctNo);

}
/*Provide an appropriate create Account API in
Bank interface and AccountRepository
interface*/