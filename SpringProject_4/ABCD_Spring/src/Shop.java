import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.support.MethodReplacer;

public abstract class Shop {

	public abstract Discount getDiscount(String f);

}

class DiscountReplacer implements MethodReplacer {

	Map<String, Integer> season;

	DiscountReplacer(Map<String, Integer> season) {
		this.season = season;
		System.out.println(season);
	}

	@Override
	public Object reimplement(Object arg0, Method method, Object[] arg2) throws Throwable {
		System.out.println("Reimplementing " + method.getName());
		return new Discount(this.season);
	}
}

class Discount {
	Map<String,Integer> seasonName;

	Discount(Map<String, Integer> season) {
		this.seasonName = season;
		//System.out.println("________________"+season);
	}

	int flg;

	int getDiscountPercentage(String f) {
//		System.out.println("______________"+f);
		for(Map.Entry<String,Integer> map :seasonName.entrySet() ) {
			if(f.equals(map.getKey())) {
				
				return map.getValue();
			}
					
		}
		return flg;}}
		//return flg;}

