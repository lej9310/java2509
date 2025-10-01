package ch07.sec08.exam1;

public class CarExample {

	public static void main(String[] args) {
		// 7.8. 다형성 : 실행결과가 다양하게 나오는 성질 >> 자동 타입 변환 & 메소드 재정의(overriding)
		// 프로그램을 구성하는 객체를 바꾸면 실행 성능이 달라짐

		// Car 객체 생성
		Car myCar = new Car();

		// Tire 객체 장착
		myCar.tire = new Tire();
		myCar.run();

	}

}
