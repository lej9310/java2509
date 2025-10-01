// A와 다른 패키지
package ch07.sec06.package2;

import ch07.sec06.package1.A;

// 부모 클래스 상속 >> A의 protected 필드/생성자/메소드 접근 가능
// 단 new 연산자를 사용해서 생성자를 직접 호출하 수는 없음 >> super()로 호출
public class D extends A {

	// 생성자 선언
	public D() {		
		super();  // A() 생성자 호출
	}

	// 메소드 선언
	public void method1() {
		// A 필드값 변경
		this.field = "value";
		// A 메소드 호출
		this.method1();
	}

	// 메소드 선언
	public void method2() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}
