package com.rkit.web.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.rkit.domain.Account;
import com.rkit.domain.AccountNotFoundException;
import com.rkit.domain.Bank;
import com.rkit.domain.InsufficientFundsException;
@Controller
public class BankController {
	@Autowired
	Bank bank;

	@RequestMapping("/account")
	public String createAccount(Model model){
		model.addAttribute(new Account());
		return "accountOpeningForm";
	}
	@RequestMapping(value="/createAccount" ,method=RequestMethod.POST)
	public String createAccount(@ModelAttribute("account") Account acct, BindingResult result)
	{
		if(result.getErrorCount()==0){
			
//				System.out.println("Account received from session is "+acct1.getBalance());
				try {
					bank.createAccount(acct);
				} catch (InsufficientFundsException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return "success";
			}
		
		
		else{
			return "error";
		}
	}
	@RequestMapping(value="/withdraw" ,method=RequestMethod.GET)
	public String withdraw()
	{
		return "withdrawal";
	}
	@RequestMapping(value="/withdraw/{accNo}/{amount}" ,method=RequestMethod.GET)
	@ResponseBody
	public String withdraw(@PathVariable("accNo") int accNo, @PathVariable("amount") int amount)
	{
		try {
			bank.withdraw(accNo, amount);
		} catch (AccountNotFoundException | InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "<h1>Withdrawal is successful</h1>";
	}
}


