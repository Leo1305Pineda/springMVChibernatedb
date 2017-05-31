package com.build.zoan.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "student")
public class Student implements Serializable{
	@Id
	@Column(name="idStudent")
	@GeneratedValue(strategy=GenerationType.AUTO) // para el auto incremento
	private Integer idStudent;
	
	@Column(name="firtname")
	private String firtname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="year")
	private String year;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String fitname, String lastname, String year) {
		super();
		this.firtname = fitname;
		this.lastname = lastname;
		this.year = year;
	}

	public Integer getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(Integer idStudent) {
		this.idStudent = idStudent;
	}

	public String getFirtname() {
		return firtname;
	}

	public void setFirtname(String fitname) {
		this.firtname = fitname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", firtname=" + firtname + ", lastname=" + lastname + ", year="
				+ year + "]";
	}

}
