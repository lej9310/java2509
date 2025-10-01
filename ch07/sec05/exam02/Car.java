package ch07.sec05.exam02;

public class Car {
	// 예제. Car 클래스의 stop 메소드를 final로 선언했기 때문에 자식 클래스인 SportsCar에서 stop 메소드를 오버라이딩할 수
	// 없음

	// 필드 선언
	public int speed;

	// 메소드 선언
	public void speedUp() {
		speed += 1;
	}

	// final 메소드
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
