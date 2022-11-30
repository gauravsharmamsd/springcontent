import java.util.Map;
import java.util.Scanner;

public class DiscountPolicy {
	private Map<String,Integer> baseDiscountMap;
	static Scanner sc = new Scanner(System.in);
	DiscountPolicy(Map<String,Integer> map){
		this.baseDiscountMap = map;
		System.out.println(this.baseDiscountMap);
	}
	public static String getCustomerName() {
		System.out.println("Enter Your Name ");
		String name = sc.next();
		return name;
	}

	
	public int calculateDiscount() {
		System.out.println("Enter Festival Name and See the discount ");
		String festival = sc.next();
		System.out.println("Enter Amount of purchase");
		int amount = sc.nextInt();
		
		System.out.println("Inside calculateDiscount "+festival+" "+amount);
		int totalDiscount=0;
		if(amount >= 5000) {
			totalDiscount += baseDiscountMap.get(festival)+20;
		}else if(amount <=5000 && amount >=3000) {
			totalDiscount += baseDiscountMap.get(festival)+15;
		}else if(amount <=3000 && amount >=2500) {
			totalDiscount += baseDiscountMap.get(festival)+10;
		}
		return baseDiscountMap.get(festival);
	}

}
