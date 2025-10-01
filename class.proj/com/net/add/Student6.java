package com.net.add;

public class Student6 {

	// 인스턴스 필드 선언 =========================
	String companyId;
	String name;
	int age = 24; // 초기값 설정(고정)

	// 기본 Constructor 선언 =========================
	public Student6() {
		System.out.println("학생 생성");
	}

	// 필수 입력을 갖는 Constuctor 선언 =========================
	// Constuctor 기능: 오브젝트의 초기값 설정
	// 매개변수가 1개인 Constructor
	public Student6(String name) {
		this.name = name;
		System.out.println(this.name + " 입니다.");
	}

	// 매개변수가 2개인 Constructor
	public Student6(String companyId, String name) {
		this.companyId = companyId;
		this.name = name;
		System.out.println(this.name + "의 사원번호는 " + this.companyId + " 입니다.");
	}

	// 매개변수가 3개인 Constructor
	public Student6(String companyId, String name, int age) {
		this.companyId = companyId;
		this.name = name;
		this.age = age;
		System.out.println(this.name + "의 사원번호는 " + this.companyId + "이고, 나이는 " + this.age + " 입니다.");
	}

	// 메소드 : 엑션_행동 구역 =========================
	public void introduce() {
		System.out.println(this.name + "이 자기소개하기");
	}

	public void study() {
		System.out.println(this.name + "이 공부하기");
	}

}
