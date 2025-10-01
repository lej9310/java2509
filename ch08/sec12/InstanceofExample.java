package ch08.sec12;

public class InstanceofExample {
	public static void main(String[] args) {
		// 8.12. 객체 타입 확인 - instanceof 연산자 사용
		
		// 구현 객체 생성
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		// ride 메소드 호출 시 구현 객체를 매개값으로 전달
		ride(taxi);
		System.out.println();
		ride(bus);		
	}

	// 인터페이스 매개변수를 갖는 메소드
	private static void ride(Vehicle vehicle) {		
				
		// 방법1. 매개값이 Bus인 경우(vehicle에 대입된 객체가 Bus)에만 강제 타입 변환해서 checkFare 메소드 호출
		if (vehicle instanceof Bus) {			
			Bus bus = (Bus) vehicle;
			bus.checkFare();			
		}
		
		// 방법2. Java 12부터 instanceof 연산 결과가 true일 경우, 우측 타입 변수 사용
		// >> 강제 타입 변환 필요 없음
		if (vehicle instanceof Bus bus) {
			bus.checkFare();
			
		}
		
	}
	
}
