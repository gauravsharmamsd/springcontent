import org.springframework.beans.factory.FactoryBean;

public class CustomFactoryBean implements FactoryBean<A>{
	private String s;
	private int i;
	CustomFactoryBean(int i, String s){
		this.s = s;
		this.i =i;
	}
	@Override
	public A getObject() throws Exception {
		System.out.println("Inside CustomFactoryBean ..getObject");
		A a = new A();
		a.setI(this.i);
		a.setS(this.s);
		return a;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

}
