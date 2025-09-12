package com.net.add;

public class Student5 {

	// Constructor 생성
	// 기본 생성자
	public Student5() {
		System.out.println("학생이 생성되었습니다.");
	}

	// 매개변수가 1개인 생성자
	public Student5(String name) {
		System.out.println(name + "이 생성되었습니다.");
	}

	// 매개변수가 2개인 생성자
	public Student5(String name, int age) {
		System.out.println(name + "의 나이는 " + age + " 입니다.");
	}

	// 매개변수가 3개인 생성자
	public Student5(String name, int age, String studenId) {
		System.out.println(name + "의 나이는 " + age + ", 학번은 " + studenId + "입니다.");
	}
}
