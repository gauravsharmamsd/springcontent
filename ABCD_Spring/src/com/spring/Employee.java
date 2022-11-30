package com.spring;

public class Employee {
String name;
int id;
String color;
Address addr;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public Address getAddr() {
	return addr;
}
public void setAddr(Address addr) {
	this.addr = addr;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", color=" + color + ", addr=" + addr + "]";
}
public Employee(String name, int id, String color, Address addr) {
	super();
	System.out.println("Employee class parameterized constructor");

	this.name = name;
	this.id = id;
	this.color = color;
	this.addr = addr;
}
public Employee() {
	System.out.println("Employee class default constructor");

	
	// TODO Auto-generated constructor stub
}

}
