package bank.server.internal;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseFactoryBean;

import bank.iserver.internal.service.AccountRepository;
import bank.iserver.internal.service.AccountService;
import bank.server.Bank;

//TODO 1
//Enable JavaConfig
@Configuration
//import test-infrastructure-Java_Based_config.xml;
//TODO2

public class BankConfig {

	// TODO3 use @Value() annotation to initialize all properties from
	// jdbcProperties file
	@Value("${oracleURL}")
	private String url;
	@Value("${oracleUser}")
	private String username;
	@Value("${oraclePassword}")
	private String password;
	@Value("${oracleDriver}")
	private String driverClassName;

	public void A() {
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		System.out.println(driverClassName);
	}

//TODO4 make this method as bean registration method using annotation @Bean
	@Bean
	Bank bankService() {
		Collection<AccountService> accts = new ArrayList<AccountService>();
		accts.add(currentAccount());
		accts.add(loan());
		accts.add(saving());
		return new BankImpl(accountRepository(), accts);
	}

	@Bean(name = "acctRepo")
	AccountRepository accountRepository() {
		return new AccountRepositoryImpl(dataSource());
		// TODO 5 return instance of account repository by injecting dataSource
	}

	// TODO 6 use appropriate annotation
	@Bean
	AccountService currentAccount() {
		CurentAccount acct = new CurentAccount("Ramkrishna IT", 1000000);
		acct.setAcctNo(123456789);
		return acct;
	}

	// TODO 7 use appropriate annotation
	@Bean
	AccountService saving() {
		SavingsType saving = new SavingsType("vivek Kulkarni");
		saving.setInterestRate(10.5f);
		return saving;
	}

	// TODO 8 use appropriate annotation
	@Bean
	AccountService loan() {
		LoanAccount loan = new LoanAccount("HousingLoan", 15);
		loan.setRateOfInterest(11.5f);
		return loan;
	}

	// TODO 10
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource(url, username, password);
		dataSource.setDriverClassName(driverClassName);
		return dataSource;
	}
}
