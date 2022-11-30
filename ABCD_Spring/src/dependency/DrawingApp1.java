package dependency;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp1 {
public static void main(String[] args) {
//	Triangle t=new Triangle();
//	t.draw();
	ApplicationContext springContainer = new ClassPathXmlApplicationContext("spring.xml");
	
Triangle2 t=(Triangle2) springContainer.getBean("triangle");
System.out.println(t);

t.draw();
	
}
}
