import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("app-config.xml");//All objects created here
		/*Magician magician = (Magician) container.getBean("magician");
		System.out.println("shich class Object is this ? "+magician.getClass().getName());
		System.out.println(magician.getBox().showContent());
		*/
		Scanner sc =new Scanner(System.in);
		Shop shop = (Shop) container.getBean("shop");
		while(true){
			System.out.println("Enter fesitval name and see discount");
		String f=sc.next();
		System.out.println("The discount is "+shop.getDiscount(f).getDiscountPercentage(f)+"%");
		}
		
	}

}
