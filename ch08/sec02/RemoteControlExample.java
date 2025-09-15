package ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		// 변수 선언과 구현 객체 타입
		RemoteControl rc;

		// 인터페이스를 통해 구현 객체를 사용하려면 >>
		// Television 객체 만들고,
		rc = new Television();
		// 인터페이스 변수에 구현객체의 번지 대입
		rc.turnOn();

		// rc 변수에 Audio 객체를 대입(교체)
		rc = new Audio();
		rc.turnOn();

	}

}
