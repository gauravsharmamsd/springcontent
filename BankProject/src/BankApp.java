import java.util.List;

public class BankApp {
List<Bank> bank;

public List<Bank> getBank() {
	return bank;
}

public void setBank(List<Bank> bank) {
	this.bank = bank;
}

@Override
public String toString() {
	return "BankApp [bank=" + bank + "]";
}

public BankApp(List<Bank> bank) {
	super();
	this.bank = bank;
}

public BankApp() {
	super();
	// TODO Auto-generated constructor stub
}

}
