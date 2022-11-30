
public class SBI implements Bank {
	Account acct;

	public SBI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SBI(Account acct) {
		super();
		this.acct = acct;
	}

	@Override
	public String toString() {
		return "SBI [acct=" + acct + "]";
	}

	public Account getAcct() {
		return acct;
	}

	public void setAcct(Account acct) {
		this.acct = acct;
	}

	@Override
	public Account openAccount() {
		System.out.println("Account open Succesfully....");
		return acct;
	}

	@Override
	public void withdraw() {
		System.out.println("Balance withdraw...");
		
	}

}


