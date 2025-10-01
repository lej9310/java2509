package ch06.sec13.exam2.package1;

public class A {

	// 생성자의 접근 제한
	// 객체를 생성하기 위해 생성자를 어디에서나 호출하 수 있는 것은 아님
	// public: 모든 패키지에서 생성자호출 & 객체 생성
	// default: 같은 패키지에서만 생성자 호출 & 객체 생성
	// private: 클래스 내부에서만 생성자 호출 & 객체 생성

	// 필드 선언
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");

	// public 접근 제한 생성자 선언
	public A(boolean b) {
	}

	// default 접근 제한자 선언
	A(int b) {

	}

	// private 접근 제한자 선언
	private A(String s) {

	}
}
