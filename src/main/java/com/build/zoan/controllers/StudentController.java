package com.build.zoan.controllers;

import java.util.Date;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.build.zoan.models.Student;
import com.build.zoan.services.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping("student")
	public String student(Map<String, Object> map){
		
		Student student = new Student();
		//student.setFitname("Leonardo2");
		//student.setLastname("Pineda2");
		//student.setYear("26");
		map.put("student", student);
		map.put("studentList", this.studentService.getAllStudent());
		return "student";
	}
	
	@RequestMapping(value="student.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Student student, 
			BindingResult result, 
			@RequestParam String action,
			Map<String, Object> map){
	
		Student studentResult = new Student();
		String value = action.toLowerCase();
		System.out.println(value);
		switch (value) {
		case "add":
			this.studentService.add(student);
			studentResult = student;
			break;
		case "edit":
			this.studentService.edit(student);
			studentResult = student;
			break;
		case "delete":
			this.studentService.delete(student.getIdStudent());
			studentResult = student;
			break;
		case "search":
			Student searchStudent = this.studentService.getStuden(student.getIdStudent()); 
			studentResult = searchStudent!=null ? searchStudent : new Student();
			break;
		default:
			break;
		}
		
		map.put("student", studentResult);
		System.out.println("El tamaño de la lista estudiante es: "+this.studentService.getAllStudent().size());
		map.put("studentList", this.studentService.getAllStudent());
		
		return "student";
	}
	
}
