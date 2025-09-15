package ch09.sec02.exam01;

public class A {
	// 9.1. 중첩 클래스: 클래스 내부에 선언한 클래스
	// 멤버 클래스: 클래스의 멤버로서 선언
	// 로컬 클래스: 메소드 내부에서 선언

	// 9.2. 인스턴스 맴버 클래스
	// 인스턴스 멤버 클래스
	class B {
	}

	// 인스턴스 필드값으로 B 객체 대입
	B field = new B();

	// 생성자
	A() {
		B b = new B();
	}

	// 인스턴스 메소드
	void method() {
		B b = new B();
	}
}
