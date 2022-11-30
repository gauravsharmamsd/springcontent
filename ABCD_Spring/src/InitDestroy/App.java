package InitDestroy;



import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx =new ClassPathXmlApplicationContext("pr.xml");
		//ApplicationContext ctx =new ClassPathXmlApplicationContext("application-Map.config.xml")
	
    	CustomerService cust = (CustomerService)ctx.getBean("customerService");
    	
    	System.out.println(cust);
    	
    	((ConfigurableApplicationContext) ctx).close();
    }
}