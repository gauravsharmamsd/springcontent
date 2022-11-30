package com.an;

public interface Bank {
	
	@LogEntry
	int openAccount();
	int withdraw();

}
