package ch09.sec05.exam02;

public class A {

	// 바깥 클래스의 객체 접근
	// 중첩 클래스 내부 this >> 해당 중첩 클래스
	// 중첨 클래스 내부에서 바깥 클래스 객체 얻으려면 >> 바깥 클래스 이름.this

	// 예제. 중첩 클래스와 바깥 클래스가 동일한 이름의 인스턴스 필드/메소드일 때, 바깥 객체 소속을 사용하는 방법 ========

	// A 인스턴스 필드
	String field = "A-field";

	// A 인스턴스 메소드
	void method() {
		System.out.println("A-method");
	}

	// 인스턴스 멤버 클래스
	class B {
		// B 인스턴스 필드
		String field = "B-field";

		// B 인스턴스 메소드
		void method() {
			System.out.println("B-method");
		}

		// B 인스턴스 메소드
		void print() {
			// B 객체의 필드와 메소드 사용
			System.out.println(this.field);  // >> B-field
			this.method();                   // >> B-method

			// A 객체의 필드와 메소드 사용
			System.out.println(A.this.field); // >> A-field
			A.this.method();                  // >> A-method
		}
	}

	// A의 인스턴스 메소드
	void useB() {
		B b = new B();
		b.print();
	}
}
