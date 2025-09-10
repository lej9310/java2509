// 같은 패키지
package ch06.sec13.exam3.package1;

public class B {
	public void method() {
		// 생성자의 접근 제한 >> public, default, private
		
		// 객체 생성
		A a = new A();
		
		// 필드값 변경
		a.field1 = 1;  // public
		a.field2 = 1;  // default
		a.field3 = 1;  // private >> 컴파일 에러
		
		// 메소드 호출
		a.method1(); // public
		a.method2(); // default
		a.method3();  // private >> 컴파일 에러
	}
}
