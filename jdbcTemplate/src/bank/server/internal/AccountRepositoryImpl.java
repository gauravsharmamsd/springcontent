package bank.server.internal;

import static java.lang.String.format;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import bank.iserver.internal.service.AccountRepository;

public class AccountRepositoryImpl implements AccountRepository {

	Set<Account> accounts = new HashSet<Account>();
	DriverManagerDataSource dataSource;
	JdbcTemplate template;
	public AccountRepositoryImpl(DriverManagerDataSource dataSource, JdbcTemplate jdbcTemplate) {
		template=jdbcTemplate;
		try{
			jdbcTemplate.execute("create table SPRING_ACCOUNTS_13 (CUSTOMER_NAME varchar(50), ACCT_NO int, BALANCE int)");
		}catch(Exception ex){
			System.out.println("Exception occurred while creating table "+ex.getClass().getName());
		}
		System.out.println("AccountRepository Impl constructor called");
		Account acct1 = new Account(100, "Vivek", 1234);
		accounts.add(acct1);
		Account acct2 = new Account(200, "Krishna", 12345);
		accounts.add(acct2);
		Account acct3 = new Account(300, "Shriram", 123456);
		accounts.add(acct3);
		insertIntoDB(accounts);
	}
	private void insertIntoDB(Collection<Account> accounts2) {
		int size = accounts2.size();
		String[] sqls = new String[size];
		for(Account acct : accounts2){
			String sql = "insert into SPRING_ACCOUNTS_13 values('"+acct.getName()+"','"+acct.getAcctNo()+"','"+acct.getBalance()+"')";
			sqls[--size]=sql;
		}
		template.batchUpdate(sqls);
	}
	@Override
	public Account findAccountByAcctNumber(int acctNo) {
		for(Account acct : accounts){
			if( acct.getAcctNo() == acctNo)
				return acct;
		}
		return null;
	}
	public  Account createAccount(String name, int balance, int acctNo){
		return new Account(balance,name,acctNo);
	}

}
