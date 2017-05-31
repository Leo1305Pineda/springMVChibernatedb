package com.build.zoan.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.build.zoan.dao.StudentDao;
import com.build.zoan.models.Student;
import com.build.zoan.services.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;
	
	@Transactional
	public void add(Student student) {
		// TODO Auto-generated method stub
		studentDao.add(student);
	}

	@Transactional
	public void edit(Student student) {
		// TODO Auto-generated method stub
		studentDao.edit(student);
	}

	@Transactional
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		studentDao.delete(id);
	}

	@Transactional
	public Student getStuden(Integer id) {
		// TODO Auto-generated method stub
		return studentDao.getStuden(id);
	}

	@Transactional
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return this.studentDao.getAllStudent();
	}

}
