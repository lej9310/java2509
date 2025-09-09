package com.ex.st;

public class Student6 {

	// 클래스 내에서 공통적으로 사용되는 값을 저장
	String name;
	int age;
	String studentID;

	// 기본생성자 커스터마이징
	public Student6() {
		System.out.println(name + age + studentID);
		System.out.println("기본 학생이 생성되었습니다.");
	}

	// 매개변수가 있는 생성자(필수입력)
	public Student6(String argName, String argStudentID) {
		this.name = argName;
		this.studentID = argStudentID;
		System.out.println(this.name + "(학번: " + this.studentID + ")" + "학생이 생성되었습니다.");
	}

	// 매개변수가 있는 생성자(필수입력) - 모든 필드 적용
	public Student6(String argName, int argAge, String argStudentID) {
		this.name = argName;
		this.age = argAge;
		this.studentID = argStudentID;
		// System.out.println(name + "(학번: " + studentID + ", 나이: " + age + ")" + "학생이
		// 생성되었습니다.");
		System.out.println(this.name + "(학번: " + this.studentID + ", 나이: " + this.age + ")" + "학생이 생성되었습니다.");
	}

	// 클래스를 통한 오브젝트 생성했을 때
	public void study() {
		System.out.println("^^" + this.name + "님이 공부를 합니다.");
	}

	public void introduce() {
		System.out.println("^^" + this.name + " 학생을 소개합니다.");
	}

}
