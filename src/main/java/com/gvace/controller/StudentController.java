package com.gvace.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gvace.entity.Student;
import com.gvace.service.StudentService;
@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	//http://localhost:8081/students
	@RequestMapping(method=RequestMethod.GET)
	public Collection<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	//http://localhost:8081/students/1
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") int id){
		return studentService.getStudentById(id);
	}
	
	//http://localhost:8081/students/1
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void deleteStudentById(@PathVariable("id") int id){
		studentService.removeStudentById(id);
	}

	//http://localhost:8081/students
	@RequestMapping(method=RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateStudent(@RequestBody Student student) {
		studentService.updateStudent(student);
	}

	//http://localhost:8081/students
	@RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertStudent(@RequestBody Student student) {
		studentService.insertStudent(student);
	}
}
