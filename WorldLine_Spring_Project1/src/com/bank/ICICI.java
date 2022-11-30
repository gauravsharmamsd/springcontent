package com.bank;

import java.util.HashSet;
import java.util.Set;

public class ICICI implements Bank {
	static String name="ICICI";
	public String getBankName() {
		return name;
	}
		String branch;
		
		Set<Account> set=new HashSet<Account>();
		
		@Override
		public Set<Account> getSet() {	
			return set;
		}


		public void setSet(Set<Account> set) {
			this.set = set;
		}
		
		@Override
		public String getBr() {
			// TODO Auto-generated method stub
			return branch;
		}
		

		public void setBranch(String branch) {
			this.branch = branch;
		}
			
		public ICICI() {
			super();
			System.out.println("Default ICICI");
		}

		public ICICI(Set<Account> act) {
			this.set = act;
			System.out.println("ICICI Created with Account as parameter");
		}

		@Override
		public void openAccount() {
			System.out.println("Account Opend");
			
		}

		@Override
		public void withDraw() {
			System.out.println("Withdrawing Money done");
			
		}


}
