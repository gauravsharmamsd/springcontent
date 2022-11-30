package bank.server.internal;
import bank.iserver.internal.service.AccountRepository;
import bank.server.*;


import bank.server.Bank;

public class BankImpl implements Bank {
	
    AccountRepository accountRepo;
    int branchCode;
    
	public BankImpl(AccountRepository accountRepo, int branchCode) {
		super();
		this.accountRepo = accountRepo;
		this.branchCode = branchCode;
	}
	public BankImpl(int branchCode) {
		super();
		
		this.branchCode = branchCode;
	}
	public AccountRepository getAccountRepo() {
		System.out.println(accountRepo);
		return accountRepo;
	}

	public void setAccountRepo(AccountRepository accountRepo) {
		this.accountRepo = accountRepo;
	}

	public BankImpl() {
		super();
		System.out.println("Private constructor called");
		// TODO Auto-generated constructor stub
	}

	public BankImpl(AccountRepository accountRepo) {
		System.out.println(accountRepo);
		this.accountRepo = accountRepo;
		System.out.println(accountRepo);
	}

	@Override
	public int withdraw(int amount, int acctNo) {
		Account acct = accountRepo.findAccountByAcctNumber(acctNo);
		if(amount>acct.getBalance()) {
			System.out.println("Your Account bal is low");
			return acct.getBalance();
		}
		
		acct.setBalance(acct.getBalance()-amount);
		return acct.getBalance();

	}

}
