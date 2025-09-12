package ch07.sec03.exam2;

public class SmartPhone extends Phone {
	// 자식 생성자 선언
	public SmartPhone(String model, String color) {

		// 부모 생성자 호출 >> 반드시 작성
		super(model, color);
		System.out.println("SmartPhone(String mode, String color) 생성자가 실행됨");
	}
}
