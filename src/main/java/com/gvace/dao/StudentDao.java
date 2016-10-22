package com.gvace.dao;

import java.util.Collection;

import com.gvace.entity.Student;

public interface StudentDao {

	Collection<Student> getAllStudents();

	Student getStudentById(int id);

	void removeStudentById(int id);

	void insertStudent(Student student);

	void updateStudent(Student student);

}