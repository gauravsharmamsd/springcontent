package bank.server.internal;

import java.util.Scanner;

public class Name {
public static String getName() {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter name......");
	String name=s.next();
	return name;
	
}
}
