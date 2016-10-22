package com.gvace.entity;

public class Student {
	private int id;
	private String name;
	private int age;
	private int departmentID;
	
	public Student() {
		super();
	}
	public Student(int id, String name, int age, int departmentID) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.departmentID = departmentID;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
}
