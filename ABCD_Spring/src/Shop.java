import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public abstract class Shop {
	public abstract Discount getDiscount();
}
class DiscountReplacer implements MethodReplacer{
    String season;
    DiscountReplacer(String season){
    	this.season = season;
    }
	@Override
	public Object reimplement(Object arg0, Method method, Object[] arg2) throws Throwable {
		System.out.println("Reimplementing "+method.getName());
		return new Discount(this.season);
	}	
}
class Discount {
	String seasonName;
	Discount(String season){
		this.seasonName = season;
	}
	int getDiscountPercentage() {
		if(this.seasonName.equals("Diwali")) {
			return 30;
		}else if(this.seasonName.equals("Holi")){
			return 10;
		}
		return 0;
	}
}
