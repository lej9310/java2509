package ch08.sec11.exam02;

//Vehicle 상속
public class Taxi implements Vehicle {

	// 추상 메소드 오버라이딩
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
