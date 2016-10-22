package com.gvace.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.gvace.entity.Student;
@Repository
@Qualifier("fakeData")
public class StudentDaoImplFake implements StudentDao {
	private static Map<Integer,Student> students;
	static{
		students = new HashMap<Integer,Student>(){
			{
				put(1, new Student(1,"Jack",20,1));
				put(2, new Student(2,"Sam",23,1));
				put(3, new Student(3,"Jim",24,2));
				put(4, new Student(4,"John",20,2));
				put(5, new Student(5,"Trump",12,3));
			}
		};
	}
	/* (non-Javadoc)
	 * @see com.gvace.dao.StudentDao#getAllStudents()
	 */
	@Override
	public Collection<Student> getAllStudents(){
		return students.values();
	}
	/* (non-Javadoc)
	 * @see com.gvace.dao.StudentDao#getStudentById(int)
	 */
	@Override
	public Student getStudentById(int id){
		return students.get(id);
	}
	/* (non-Javadoc)
	 * @see com.gvace.dao.StudentDao#removeStudentById(int)
	 */
	@Override
	public void removeStudentById(int id) {
		students.remove(id);
	}
	/* (non-Javadoc)
	 * @see com.gvace.dao.StudentDao#insertStudent(com.gvace.entity.Student)
	 */
	@Override
	public void insertStudent(Student student) {
		students.put(student.getId(), student);
	}
	/* (non-Javadoc)
	 * @see com.gvace.dao.StudentDao#updateStudent(com.gvace.entity.Student)
	 */
	@Override
	public void updateStudent(Student student) {
		Student s = students.get(student.getId());
		s.setName(student.getName());
		s.setAge(student.getAge());
		s.setDepartmentID(student.getDepartmentID());
	}
}
