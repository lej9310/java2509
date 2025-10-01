package ch08.sec03;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		// 상수는 구현 객체와 관련 없는 인터페이스 소속 멤버 >> 인터페이스로 바로 접근
		System.out.println("리모콘 최대 볼륨: " + RemoteControl.MAX_VOLUME);
		System.out.println("리모콘 최대 볼륨: " + RemoteControl.MIN_VOLUME);

	}

}
