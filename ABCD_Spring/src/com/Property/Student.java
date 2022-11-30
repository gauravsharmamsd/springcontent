package com.Property;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

String name;
	
String course;
int age;

public String getName() {
	return name;
}
@Value("${name}")
public void setName(String name) {
	this.name = name;
}
public String getCourse() {
	return course;
}
@Value("${course}")
public void setCourse(String course) {
	this.course = course;
}
public int getAge() {
	return age;
}
@Required
@Value("${age}")
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Student [name=" + name + ", course=" + course + ", age=" + age + "]";
}
public Student() {
	super();
	System.out.println("Defaukt constructor caled");
	// TODO Auto-generated constructor stub
}
public void display() {
	System.out.println(name+"   "+course+"  "+age);
}
public Student(String name, String course, int age) {
	super();
	System.out.println("Called");
	this.name = name;
	this.course = course;
	this.age = age;
}

}
