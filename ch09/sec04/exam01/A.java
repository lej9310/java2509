package ch09.sec04.exam01;

public class A {
	// 로컬 클래스: 메소드 내부에서 선언 >> 생성자와 메소드가 실행될 동안만 객체 생성

	// 생성자
	A() {
		// 로컬 클래스 선언
		class B {
		}

		// 로컬 객체 생성
		B b = new B();
	}

	// 메소드
	void method() {
		// 로컬 클래스 선언
		class B {
		}

		// 로컬 객체 생성
		B b = new B();
	}

}
