package kr.co.abstr;

public class AbstrClass {
	// 추상클래스 >> 객체 생성 불가 >> 상속받은 자식 클래스에서 객체 생성
	// 구현부=실행부 {} 없음
	// 자식 클래스가 없는 부모 추상 클래스는 필요 없음 >> 제거
	
	public AbstrClass() {

		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
	}

}
