package com.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.stu.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet res, int rowNum) throws SQLException {
		Student student = new Student();
		int rollNo = res.getInt("Roll_No");
		String name = res.getString(1);
		String address = res.getString("Student_Address");
		student.setRollNo(rollNo);
		student.setName(address);
		student.setAddress(address);
System.out.println("map row called");
		return student;
	}

}
