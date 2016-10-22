package com.gvace.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gvace.dao.StudentDao;
import com.gvace.entity.Student;
@Service
public class StudentService {
	@Autowired
	@Qualifier("fakeData")
	private StudentDao studentDao;
	
	public Collection<Student> getAllStudents(){
		return studentDao.getAllStudents();
	}
	public Student getStudentById(int id){
		return studentDao.getStudentById(id);
	}
	public void removeStudentById(int id) {
		studentDao.removeStudentById(id);
	}
	public void updateStudent(Student student) {
		studentDao.updateStudent(student);
	}
	public void insertStudent(Student student) {
		studentDao.insertStudent(student);
	}
}
