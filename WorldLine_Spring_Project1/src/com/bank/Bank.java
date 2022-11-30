package com.bank;

import java.util.Set;

public interface Bank {
	public void openAccount();
	public void withDraw();
	public Set<Account> getSet();
	public String getBr();
	public String getBankName();
}
