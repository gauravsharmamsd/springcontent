import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

public class LoggingAspect implements InvocationHandler{
    Bank bank;
    LoggingAspect(Bank bank){
    	this.bank = bank;
    }

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getDeclaredAnnotation(LogEntry.class)!=null)
			System.out.println("Entering "+method.getName()+ " at "+new Date());
		return method.invoke(this.bank, args);//actual method call to Bank Object
		
	}

}
