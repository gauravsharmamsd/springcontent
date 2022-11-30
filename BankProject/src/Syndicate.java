
public class Syndicate implements Bank {
	Account acct;

	public Syndicate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Syndicate(Account acct) {
		super();
		this.acct = acct;
	}

	@Override
	public String toString() {
		return "Syndicate[acct=" + acct + "]";
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




