package kr.co.abstr;

// 추상클래스 >> 객체 생성 불가
public abstract class Shape {

	public Shape() {

	}

	// 추상메소드 선언 >> 자식 클래스에서 구현
	abstract String getShapeType();
}
