package com.database;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.stu.Student;

@Service
public class StudentImpl implements StudentDAO {
	private JdbcTemplate jdbc=new JdbcTemplate(getDataSource());


	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public void insert(Student student) {
      
		String sql = "insert into student values(?,?,?)";
		Object[] o = { student.getRollNo(), student.getName(), student.getAddress() };
		int no = jdbc.update(sql, o);
		System.out.println("No of row inserted is " + no);

	}
	public DataSource getDataSource() {
	        	String url="jdbc:mysql://localhost:3306/School";
				String psd="root";
				String uid="root";
				DataSource dataSource=new DriverManagerDataSource(url,uid,psd);
				return dataSource;
	}

	@Override
	public boolean deleteRecordByRollNo(int rollNo) {
		String sql = "delete from student where RollNo=?";
		int no = jdbc.update(sql, rollNo);
		if (no == 1) {
			System.out.println("No of row deleted iz " + no);
			return true;
		}
		System.out.println("not able to delete");
		return false;
	}

	@Override
	public int deleteRecordbyStudentNameAndStudentAddress(String studName, String Address) {
		String sql = "delete from student where Name=? OR Address=?";
		Object[] o = { studName, Address };
		int noOfRowsDeleted = jdbc.update(sql, o);
		System.out.println("No of rows deleted  " + noOfRowsDeleted);
		// jdbc.update(sql,studName,Address);
		return noOfRowsDeleted;
	}

	@Override
	public void insert(List<Student> student) {
		String q = "insert into student (RollNo,Name,Address)values(?,?,?)";
		ArrayList<Object[]> all = new ArrayList<>();
		for (Student tempStud : student) {
			Object[] obj = { tempStud.getRollNo(), tempStud.getName(), tempStud.getAddress() };
			all.add(obj);
		}
		jdbc.batchUpdate(q, all);
		System.out.println("Batch update.......................");
	}

	@Override
	public int deleteAllRecord() {

		String sql = "truncate table student";

		int no = jdbc.update(sql);
		System.out.println("Deleted all.....................");
		return no;
	}

	@Override
	public int deleteAllRecord(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

}
