package com.rkit;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Customer {
private String name;
private String city;
private int id;
public Customer(String name ,String city,int id) {
	super();
	this.city=city;
	this.name=name;
	this.id=id;
}
public String getName() {
	return name;
}
@Override
public String toString() {
	return "Customer [name=" + name + ", city=" + city + ", id=" + id + "]";
}
public String getCity() {
	return city;
}
public int getId() {
	return id;
}
}
