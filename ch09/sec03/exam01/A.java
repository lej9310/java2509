package ch09.sec03.exam01;

public class A {

	// 9.3. 정적 멤버 클래스 : static 키워드와 함께 A 클래스의 멤버로 선언된 B 클래스
	// public static class B{} : 다른 패키지에서 B 클래스를 사용
	// class static B {}: 같은 패키지에서만 B 클래스를 사용
	// private static class B{}: A 클래스 내부에서만 B 클래스 사용

	// 정적 멤버 클래스
	static class B {}

	// 인스턴스 필드값으로 B 객체 대입
	B field1 = new B();

	// 정적 필드값으로 B 객체 대입
	static B field2 = new B();

	// 생성자
	A() {
		B b = new B();
	}

	// 익스턴스 메소드
	void method1() {
		B b = new B();
	}

	// 정적 메소드
	static void method2() {
		B b = new B();
	}
}
