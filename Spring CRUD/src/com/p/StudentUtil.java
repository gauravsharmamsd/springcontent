package com.p;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.database.StudentDAO;
import com.database.StudentImpl;
import com.stu.Student;
@Service("sss")
public class StudentUtil {
	
	
public List<Student> setUp() {
	
	Student s1=new Student();
	s1.setRollNo(1);
	s1.setAddress("pune");
	s1.setName("viru");
	
	Student s2=new Student();
	s2.setRollNo(2);
	s2.setAddress("Gzb");
	s2.setName("Kohli");
	
	
	Student s3=new Student();
	s3.setRollNo(3);
	s3.setAddress("Maharastra");
	s3.setName("Jay");
	
	ArrayList<Student> al=new ArrayList<Student>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
    System.out.println("content in lit  "+al);
	System.out.println("__________________________"+al.get(1));

	return al;

	
}

}
