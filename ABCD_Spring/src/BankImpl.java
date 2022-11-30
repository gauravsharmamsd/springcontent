import java.util.Set;

public class BankImpl {
	private String branchCode;
	private String branchName;
	private Set<Account> accounts;
	private AccountRepository repo;
	BankImpl(AccountRepository repo,Set<Account> accounts){
		this.repo = repo;
		this.accounts = accounts;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public Set<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}
	public AccountRepository getRepo() {
		return repo;
	}
	public void setRepo(AccountRepository repo) {
		this.repo = repo;
	}
	

}

class Account{}
interface AccountRepository{}
class AccountRepositoryImpl implements AccountRepository{}