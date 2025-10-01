package ch06.sec09;

public class Car {
	// 6.9. 인스턴스 멤버
	// 필드와 메소드는 선언 바업에 따라 인스턴스 멤버와 정적 멤버로 분류
	// 인스턴스 멤버로 선언되면 객체 생성 후 사용
	// 정적 멤버로 선언되면 객체 생성 없어도 사용

	// this 키워드 : 객체 자신
	// 생성자와 메소드의 매개변수명이 인스턴스 멤버인 필드명과 동일한 경우

	// 필드 선언
	String model;
	int speed;

	// 생성자 선언
	Car(String model) {
		this.model = model; // 매개변수를 필드에 대입(this 생략불가)
	}

	// 메소드 선언
	void setSpeed(int speed) {
		this.speed = speed; // 매개변수를 필드에 대입(this 생략 불가)
	}

	void run() {
		this.setSpeed(100);
		System.out.println(this.model + "가 달립니다.(시속: " + this.speed + "km/h)");
	}
}
