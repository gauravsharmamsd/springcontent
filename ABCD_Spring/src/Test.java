import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("app-config.xml");//All objects created here
		/*Magician magician = (Magician) container.getBean("magician");
		System.out.println("shich class Object is this ? "+magician.getClass().getName());
		System.out.println(magician.getBox().showContent());
		*/
		Shop shop = (Shop) container.getBean("shop");
		System.out.println(shop.getDiscount().getDiscountPercentage()+"%");
		
		
	}

}
