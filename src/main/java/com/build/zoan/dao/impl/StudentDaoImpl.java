package com.build.zoan.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.build.zoan.dao.StudentDao;
import com.build.zoan.models.Student;

@Repository
public class StudentDaoImpl extends AbstractHibernateDao<Student> implements StudentDao{

	@Autowired
	private SessionFactory sessionFactory;
		
	@Transactional
	public void add(Student student) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(student);
	}

	@Transactional
	public void edit(Student student) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(student);
	}

	@Transactional
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(getStuden(id));
	}

	@Transactional
	public Student getStuden(Integer id) {
		// TODO Auto-generated method stub
		return (Student) sessionFactory.getCurrentSession().get(Student.class,id);
	}

	@Transactional
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<>();
		List<Student> studentsAux = sessionFactory.getCurrentSession().createQuery("FROM student").list();
		for(Student student: studentsAux) students.add(student);
		return students ;
	}	
}
