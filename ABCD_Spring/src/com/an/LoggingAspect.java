package com.an;
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
		long start=System.currentTimeMillis();
		if(method.getDeclaredAnnotation(LogEntry.class)!=null)
			System.out.println("Entering "+method.getName()+ " at "+new Date());
		if(method.getDeclaredAnnotation(LogEntry.class)!=null) {
			long time1=System.currentTimeMillis();
		Object retval= method.invoke(this.bank, args);
		long time2=System.currentTimeMillis();
		System.out.println("Time "+(time2-time1));
		return retval;}
		else {
			return method.invoke(this.bank, args);
		}
		//actual method call to Bank Object
		
	}

}
