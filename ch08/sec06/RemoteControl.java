package ch08.sec06;

public interface RemoteControl {

	// 8.6. 정적 메소드
	// 추상 메소드와 디폴트 메소드는 구현 객체가 필요하지만, 정정 메소드는 구현 객체가 없어도 인터페이스만 호출 가능
	// [public | private] static 리턴타입 메소드명(매개변수, ...){}

	// 상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 추상 메소드
	void turnOn();

	void turnOff();

	void setVolume(int volume);

	// 디폴트 메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
			// 추상 메소드 호출하면서 상수 필드 사용
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
		}
	}

	// 정적 메소드 ===========================================
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교환합니다.");
	}
}
