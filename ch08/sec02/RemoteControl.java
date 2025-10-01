package ch08.sec02;

// 8.1. 인터페이스의 역할 : 두 장치를 연결하는 접속기
// 8.2. 인터페이스 & 구현 클래스 선언

// 인터페이스 선언: class로 만들면 안되고, "interface" 키워드 사용!
public interface RemoteControl {
	
	// public 추상 메소드: 구현부{} 없음!
	public void turnOn();

}
