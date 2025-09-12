package ch07.sec10.exam1;

public class PhoneExample {

	// 7.10. 추상 클래스
	// 공통되는 특성(필드/메소드)을 추출해서 선언한 클래스 >> 실체 클래스(:객체 생성)의 부모 역할
	// new 연산자를 사용해서 객체를 직접 생성할 수 없음
	// 부모 클래스로만 사용 >> extends 뒤에만 올 수 있음

	public static void main(String[] args) {
		// 추상 클래스 Phone은 new 연산자로 객체 생성 불가
		//Phone phone = new Phone(); 
		
		SmartPhone smartPhone = new SmartPhone("홍길동");

		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
