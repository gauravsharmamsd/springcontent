package com.stu;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.database.StudentDAO;
import com.database.StudentImpl;
import com.p.StudentUtil;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("student.xml");
		System.out.println("Application loaded....");
		StudentDAO studentDAO = (StudentImpl) ctx.getBean("studentimp");
		
		
		Student st=new Student();
		st.setAddress("beng");
		st.setName("ms");
		st.setRollNo(13);
		studentDAO.insert(st);
		/*
		 * for one element insertion------------------- Student s = new Student();
		 * s.setAddress("maha"); s.setName("Sonu"); s.setRollNo(25);
		 * studentDAO.insert(s); System.out.println(s);
		 * 
		 */
		/*
		 * for list element insertion------------------- StudentUtil studentUtil =
		 * (StudentUtil) ctx.getBean("studentutil"); System.out.println(studentUtil);
		 * studentUtil.setUp();
		 */

		/*
		 * delete by roolNo-----------------------------
		 * 
		 * studentDAO.deleteRecordByRollNo(3);
		 */
		/*
		 * delete by Name or Address-----------------------------
		 * 
		 * studentDAO.deleteRecordbyStudentNameAndStudentAddress("viru", "Nandpur");
		 */
		/*
		 * List<Student> students = studentDAO.findAllStudent(); for (Student student :
		 * students) { System.out.println(student); }
		 * 
		 */
		/*
		 * 
		 * Retrieving single row............. Student student=
		 * studentDAO.findAllStudentbyRollNo(2); System.out.println(student);
		 */
		/*
		 * delete all record------------------- studentDAO.deleteAllRecord();
		 */

	}

}
