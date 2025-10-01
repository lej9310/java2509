package ch06.sec10.exam3;

public class Car {
	// 인스턴스 멤버 사용 불가
	// 정적 메소드 & 정적 블록: 객체가 없어도 실행. 내부에 인스턴스 필드나 인스턴스 메소드 사용 불가
	// this(객체 자신 참조) 사용 불가

	// 인스턴스 필드 선언
	int speed;

	// 인스턴스 메소드 선언 >> void method() {..}
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}

	// 정적 블록 선언 >> static {...}
	static void simulate() {
		// 정적 블록에서 인스턴스 멤버 사용 >> 객체를 먼저 생성하고 참조 변수로 접근!
		// 객체 생성
		Car myCar = new Car();
		// 인스턴스 멤버 사용
		myCar.speed = 200;
		myCar.run();
	}	

	// main 메소드도 정적 메소드이므로 객체 생성 없이 인스턴스 필드/메소드를 바로 사용할 수 없음
	public static void main(String[] args) {
		// 정적 메소드 호출
		simulate();

		// 객체 먼저 생성!
		Car myCar = new Car();
		// 인스턴스 멤버 사용
		myCar.speed = 60;
		myCar.run();
	}

}
