package ch07.sec04.exam01;

// 부모 클래스 상속
public class Computer extends Calculator {

	// 메소드 오버라이딩
	@Override // 컴파일 시 정확히 오버라이딩 되었는지 체크하는 어노테이션(생략 가능)
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		// 부모 클래스의 3.14159를  Math.PI로 변경하여 오버라이딩
		return Math.PI * r * r;
	}
}
