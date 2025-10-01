package ch07.sec04.exam02;

// Airplane 부모 클래스 상속
public class SupersonicAirplane extends Airplane {

	// 상수 선언
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	// 상태 필드 선언
	public int flyMode = NORMAL;

	// 메소드 재정의
	@Override
	// 부모 클래스 Airplane의 fly() 메소드를 자식 클래스인 SupersonicAirplane에서 오버라이딩
	public void fly() {
		if (flyMode == SUPERSONIC) {
			// 초음속 비행 모드일 때 >> 오버라이딩된 fly() 메소드 사용
			System.out.println("초음속 비행합니다.");
		} else {
			// 일반 비행 모드 일때 >>  Airplane 객체의 fly() 매소드 호출
			super.fly();
		}

	}

}
