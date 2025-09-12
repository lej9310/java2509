package ch07.sec02;

public class Phone {
	// 상속: 부모가 자식에게 물려주는 행위

	// 7.2. 클래스 상속: extends 뒤에 부모 클래스는 한 개
	// public class 자식클래스 extends 부모클래스{}
	// 예제/ Phone 클래스를 상속해서 SmartPhone 클래스 생성
	
	// 필드 선언
	public String model;
	public String color;
	
	// 메소드 선언
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String message) {
		System.out.println("자기: " + message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
