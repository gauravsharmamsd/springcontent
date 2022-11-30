package com.stu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.database.StudentDAO;
import com.database.StudentImpl;
import com.p.StudentUtil;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("student.xml");
		System.out.println("Application loaded");
		StudentDAO stu = (StudentImpl) ctx.getBean("studentimp");
		Student s=ctx.getBean("student",Student.class);
	//	 Student s=new Student();
//	      s.setAddress("Bengaluru");
//	      s.setName("Maahi");
//	      s.setRollNo(12);
//		 stu.insert(s);
//		 System.out.println(s);
 
		StudentUtil st = new StudentUtil();
		System.out.println("o............");
		stu.insert(st.setUp());
    

		
	//	stu.deleteRecordByRollNo(2);
		// stu.deleteRecordbyStudentNameAndStudentAddress("sonu", "Nandpur");
//      stu.deleteAllRecord(s);
//StudentUtil st=new StudentUtil();
//st.a

	}

}
