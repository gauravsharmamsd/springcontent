import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rkit.Pune;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		System.out.println("Now Lazy Pune will be created ");
		Thread.sleep(3000);
		Pune p = (Pune) ctx.getBean("xyz");
		p.sayHello();
		
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
