package com.ex.st;

public class Student7 {

// 중요한 개인정보: 값이 클래스 밖으로부터 보호.
	private String name;
	int age; // default
	private String studentId;

	// 우클릭 - Source - Generate Getters and Setters... 클릭
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Student7 [name = " + name + ", age = " + age + ",  studentId = " + studentId + "]";
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}

}
