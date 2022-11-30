import java.util.Scanner;

public class Customer {
	public static String getCustomerName() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your Name..//// ");
		String name = sc.next();
		return name;
	}
	
	}