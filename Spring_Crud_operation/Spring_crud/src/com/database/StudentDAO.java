package com.database;

import java.util.List;

import com.stu.Student;

public interface StudentDAO {
void insert(Student student);
void insert(List<Student >student);
boolean deleteRecordByRollNo(int rollNo);
int deleteRecordbyStudentNameAndStudentAddress(String studName,String Address);
int deleteAllRecord();
List<Student> findAllStudent();
}
