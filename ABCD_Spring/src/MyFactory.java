
public class MyFactory {
	A createObject(int i, String s) {
		System.out.println("Inside MyFactory's createObject");
		A a = new A();
		a.setI(i);
		a.setS(s);
	
		return a;
	}

}
