
public class A {
	int i;
	String s;
	A(){}
	/*
	A(int i, String s){
		System.out.println("Parametrized constructor");
		this.i =i;
		this.s =s;
	}*/
	public  static A getObject(int i, String s) {
		A a = new A();
		a.setI(i);
		a.setS(s);	
		System.out.println("Inside getObject Method");
		return a;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}

}
