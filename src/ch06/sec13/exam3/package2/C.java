// 다른 패키지
package ch06.sec13.exam3.package2;

import ch06.sec13.exam3.package1.A;

public class C {
	public C() {
		// 생성자의 접근 제한 >> public, default, private

		// 객체 생성
		A a = new A();

		// 필드값 변경
		a.field1 = 1; // public
		a.field2 = 1; // default >> 컴파일 에러
		a.field3 = 1; // private >> 컴파일 에러

		// 메소드 호출
		a.method1();// public
		a.method2();// default >> 컴파일 에러
		a.method3();// private >> 컴파일 에러
	}

}
