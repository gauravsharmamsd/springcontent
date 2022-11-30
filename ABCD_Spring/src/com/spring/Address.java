package com.spring;

public class Address {
int pin;
String city,state;
@Override
public String toString() {
	return "Address [pin=" + pin + ", city=" + city + ", state=" + state + "]";
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public Address() {
	System.out.println("Address class default constructor");
	// TODO Auto-generated constructor stub
}
public Address(int pin, String city, String state) {
	super();
	System.out.println("Address class parameterised constructor");

	this.pin = pin;
	this.city = city;
	this.state = state;
}
}
