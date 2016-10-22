package com.gvace.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gvace.entity.Student;
import com.gvace.service.StudentService;
@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	//http://localhost:8081/students
	@GetMapping
	public Collection<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	//http://localhost:8081/students/first
	@GetMapping(path="first")
	public Student getFirstStudent(){
		return studentService.getStudentById(1);
	}
	
	//http://localhost:8081/students/1
	@GetMapping(value="/{id}")
	public Student getStudentById(@PathVariable("id") int id){
		return studentService.getStudentById(id);
	}
	
	//http://localhost:8081/students/1
	@DeleteMapping(value="/{id}")
	public void deleteStudentById(@PathVariable("id") int id){
		studentService.removeStudentById(id);
	}

	//http://localhost:8081/students
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateStudent(@RequestBody Student student) {
		studentService.updateStudent(student);
	}

	//http://localhost:8081/students
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertStudent(@RequestBody Student student) {
		studentService.insertStudent(student);
	}
}
