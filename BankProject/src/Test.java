import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.worldline_bank.Bank;



public class Test {

	public static void main(String[] args) {
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("Bank.xml");
		BankApp bank =(BankApp)springContainer.getBean("javaCollection");
		List<Bank> b=bank.getBank();
		for(int i=0;i< b.size();i++) {
			System.out.println(b.get(i));
		}

//			BankApp bank =(BankApp)springContainer.getBean("javaCollection");
//
//			BankApp bank2 =(BankApp)springContainer.getBean("javaCollection2");
//			System.out.println(bank.getBank());
//			System.out.println(bank.getBank().openAccount());
//			bank.getBank().withdraw();
//			System.out.println(bank.getBank().openAccount().getBal()+"  "+	bank.getBank().openAccount().getName());
//		
//			
//			System.out.println(bank);
//			System.out.println(bank2);

	}

}
