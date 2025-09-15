package ch08.sec11.exam01;

import ch08.sec11.exam02.Vehicle;

// Vehicle 상속
public class Bus implements Vehicle {
	// 추상 메소드 오버라이딩
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");		
	}

}
