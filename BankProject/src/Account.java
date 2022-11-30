
public class Account {
int bal;
String name;
public int getBal() {
	return bal;
}
public void setBal(int bal) {
	this.bal = bal;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Account(int bal, String name) {
	super();
	this.bal = bal;
	this.name = name;
}
@Override
public String toString() {
	return "Account [bal=" + bal + ", name=" + name + "]";
}
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
}
