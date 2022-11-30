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

import com.rowmapper.StudentRowMapper;
import com.stu.Student;

@Service
public class StudentImpl implements StudentDAO {
	private JdbcTemplate jdbc = new JdbcTemplate(getDataSource());
	// @Autowired
//	private JdbcTemplate jdbc;

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
		String url = "jdbc:mysql://localhost:3306/School?useSSL=false";
		String psd = "A2016ece@4701";
		String uid = "root";
		DataSource dataSource = new DriverManagerDataSource(url, uid, psd);
		return dataSource;
	}

	@Override
	public boolean deleteRecordByRollNo(int rollNo) {
		String sql = "delete from student where Roll_No=?";
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
		String sql = "delete from student where Student_Name=? OR Student_Address=?";
		Object[] o = { studName, Address };
		int noOfRowsDeleted = jdbc.update(sql, o);
		System.out.println("No of rows deleted  " + noOfRowsDeleted);
		return noOfRowsDeleted;
	}

	@Override
	public void insert(List<Student> student) {
		String q = "insert into student ( Roll_No,Student_name,Student_Address)values(?,?,?)";
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
	public List<Student> findAllStudent() {
		String insertQuery="select * from student";
	List<Student>studentsList=jdbc.query(insertQuery, new StudentRowMapper());
		return studentsList;
		
	}

}
