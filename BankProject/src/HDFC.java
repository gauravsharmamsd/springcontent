
public class HDFC implements Bank {
	Account acct;

	public HDFC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HDFC(Account acct) {
		super();
		this.acct = acct;
	}

	@Override
	public String toString() {
		return "HDFC [acct=" + acct + "]";
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
