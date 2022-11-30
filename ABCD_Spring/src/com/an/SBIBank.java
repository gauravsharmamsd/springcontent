package com.an;

public class SBIBank implements Bank{

	@Override
	
	@CheckTimeTaken
	public int openAccount() {
		
		System.out.println("SBi Business Logic of openAccount");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//long finalTime=System.currentTimeMillis()-start;
		//System.out.println("Time required for ececution" +finalTime);
		return 0;
	}

	@Override
	
	@CheckTimeTaken
	public int withdraw() {
		// TODO Auto-generated method stub
		return 0;
	}

}
