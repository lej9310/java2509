// 동일한 패키지
package ch06.sec13.exam2.package1;

public class B {
	// 생성자의 접근 제한 >> public, default, private

	// 필드 선언
	A a1 = new A(true);      // public 생성자 >> 모든 패키지
	A a2 = new A(1);           //default >> 같은 패키지 내
	A a3 = new A("문자열"); // private 생성자 >> 같은 클래스 내 >> 접근 불가
}
