package com.spring;

import java.util.ArrayList;
import java.util.List;

public class EmpStore {
Employee ee;
List<Employee> list=new ArrayList<>();
//public EmpStore(Employee ee) {
//	super();
//	this.ee = ee;
//	list.add(ee);
//}



public List<Employee> getList() {
	return list;
}



public void setList(List<Employee> list) {
	this.list = list;
}



public EmpStore() {
	super();
	// TODO Auto-generated constructor stub
}



@Override
public String toString() {
	return "EmpStore [ee=" + ee + "]";
}

public Employee getEe() {
	return ee;
}

public void setEe(Employee ee) {
	this.ee = ee;
}
}
