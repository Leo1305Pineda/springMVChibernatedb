package com.build.zoan.dao;


import java.util.List;

import com.build.zoan.models.Student;

public interface StudentDao {
	
	public void add(Student student);
	public void edit(Student student);
	public void delete(Integer id);
	public Student getStuden(Integer id);
	public List<Student> getAllStudent();
	
}

