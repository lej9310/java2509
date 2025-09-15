package ch08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		// 8.10 타입변환
		// 강제 타입 변환(Casting): 인터페이스 타입을 구현 클래스 타입으로 변환
		// >> 구현클래스 변수 = (구현클래스) 인터페이스 변수;

		// 인터페이스 변수 선언, 구현 객체 대입
		Vehicle vehicle = new Bus();
		
		// Vehicle 인터페이스를 구현한 Bus를 Vehicle로 자동 타입 변환하면, checkFare() 메소드 호출 불가
		// 인터페이스를 통해서 호출
		vehicle.run();
		
		// 강제 타입 변환 후 호출
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
	}

}
