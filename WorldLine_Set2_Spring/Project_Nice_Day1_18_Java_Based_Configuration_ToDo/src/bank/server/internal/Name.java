package bank.server.internal;

import java.util.Scanner;

public class Name {
public static String getName() {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter name................");
	String name=sc.next();
	return name;
}
}
