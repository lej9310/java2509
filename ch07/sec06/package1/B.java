// A와 동일 패키지
package ch07.sec06.package1;

public class B {

	// 메소드 선언
	public void method() {
		// 다른 패키지에 있으므로 protected 필드/생성자/메소드 접근 가능
		A a = new A();     // protected 필드
		a.field = "value"; // protected 생성자
		a.method();        // protected 메소드
	}
}
