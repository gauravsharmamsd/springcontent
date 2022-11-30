package Replacer;
import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;


class Buy implements MethodReplacer{
    
	@Override
	public Object reimplement(Object o, Method method, Object[] arg2) throws Throwable {
		System.out.println("Reimplementing "+method.getName());
		return null;
	}	
}