package com.an;

public class HDFCBank implements Bank{

	@Override
	
	public int openAccount() {
		
		//I would like to log time when method started execution
		System.out.println("Business Logic :Inside Open Account");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return 0;
	}

	@Override
	public int withdraw() {
	
		//I would like to log time when method started execution
		System.out.println("Business Logic :Inside Withdraw Account");
	
		return 0;
	}

}
