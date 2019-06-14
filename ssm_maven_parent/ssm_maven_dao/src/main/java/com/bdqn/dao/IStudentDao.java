package com.bdqn.dao;

import com.bdqn.po.Student;

import java.util.List;

public interface IStudentDao {
	public List<Student> getall();
	public void insert(Student stu) throws Exception;
}
