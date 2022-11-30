package Replacer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		System.out.println("hii");
		ApplicationContext container = new ClassPathXmlApplicationContext("NewFile.xml");
        Shop shop=(Shop) container.getBean("shop");
        shop.buy();
        shop.sell();
	}

}
