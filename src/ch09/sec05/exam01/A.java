package ch09.sec05.exam01;

public class A {

	// 9.5. 바깥 멤버 접근
	// 중첩 클래스: 바깥 클래스 멤버(필드, 메소드)에 접근 가능 >> 중첩 클래스 선언에 따라 접근 제한
	
	// A의 인스턴스 필드와 메소드
	int field1;

	void method1() {
	}

	// A의 정적 필드와 메소드
	static int field2;
	static void method2() {
	}

	// 인스턴스 멤버 클래스 >> 바깥 클래스의 모든 필드와 메소드
	class B {
		void method() {
			// A의 인스턴스 필드와 메소드 사용
			field1 = 10;
			method1();

			// A의 정적 필드와 메소드 사용
			field2 = 10;
			method2();
		}
	}

	// 정적 멤버 클래스 >> 바같 클래스의 정적 필드와 정적 메소드
	// 정적 멤버 클래스 내부에서는 바깥 클래스의 필드와 메소드를 사용할 때 제한
	static class C {
		void method() {			
			// A의 인스턴스 필드와 메소드 사용
			// field1 = 10;
			// method1();			
			
			// A의 정적 필드와 메소드 사용
			field2 = 10;
			method2();
		}
	}

}
