package ch07.sec04.exam01;

public class Calculator {
	// 7.4. 메소드 재정의 (메소드 오버라이딩)
	// 부모 클래스에서 상속된 메소드를 자식 클래스에서 재정의
	// 메소드가 오버라이딩되면 부모 메소는 숨겨지고, 자식 메소드가 우선적 사용

	// 예제. 자식 클래스의 Computer에서 부모 클래스 Calculator에서 상속된 메소드를 오버라이딩해서 원의 넓이 구하기

	// 메소드 선언
	public double areaCircle (double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159 *r*r;
	}

}