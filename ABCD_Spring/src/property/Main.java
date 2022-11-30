package property;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("stu.xml");
	System.out.println("loaded....");
	Student s=(Student) ctx.getBean("student");
	s.A();
System.out.println("********"+s.getUrl());
	
}
}
