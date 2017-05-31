package com.build.zoan.services;

import java.util.List;

import com.build.zoan.models.Student;

public interface StudentService {
	
	public void add(Student student);
	public void edit(Student student);
	public void delete(Integer id);
	public Student getStuden(Integer id);
	public List<Student> getAllStudent();

}
