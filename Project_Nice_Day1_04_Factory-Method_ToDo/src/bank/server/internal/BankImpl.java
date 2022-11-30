package bank.server.internal;
import bank.iserver.internal.service.AccountRepository;
import bank.server.*;


import bank.server.Bank;

public class BankImpl implements Bank {
	
    AccountRepository accountRepo;
    String bankName;
    int branchCode;
    static BankImpl instance;
    
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}

	public AccountRepository getAccountRepo() {
		return accountRepo;
	}

	public void setAccountRepo(AccountRepository accountRepo) {
		this.accountRepo = accountRepo;
	}

	private BankImpl() {
		super();
		System.out.println("Private constructor called");
		// TODO Auto-generated constructor stub
	}

	 private BankImpl(AccountRepository accountRepo) {
		super();
		this.accountRepo = accountRepo;
		System.out.println("Private Overloaded constructor called");
	}

	public BankImpl(AccountRepository acctRepo1, int branchCode2) {
this.accountRepo=acctRepo1;
this.branchCode=branchCode2;
	}

	@Override
	public int withdraw(int amount, int acctNo) {
		Account acct = accountRepo.findAccountByAcctNumber(acctNo);
		acct.setBalance(acct.getBalance()-amount);
		return acct.getBalance();

	}
	public  static Bank  getInstance(AccountRepository acctRepo1,int branchCode) {
		return new BankImpl(acctRepo1,branchCode);
		
	}
	public  static Bank  getInstance() {
	if(instance != null) {
		instance=new BankImpl();
	}
	return instance;
		
	}
	public void initIt() throws Exception {
		  System.out.println("Init method after properties are set:"    + bankName+"   "+ branchCode+" "+accountRepo);
		}
	public void cleanUp() throws Exception {
		  System.out.println("Done and dusted.....");
		}
	
  //TO DO Provide 2 Factory methods 1 taking no arg and second one taking 2 args
	 //hint : public static Bank  getInstance(AccountRepository acctRepo1,int branchCode)
	
	//TODO : Init and destroy methods : Provide some init and destroy methods with
	//       only sysout sttmts.
}
