package ch08.sec05;

public interface RemoteControl {
//8.5. 디폴드 메소드
	// 추상 메소드는 실행부{}가 없지만, 디폴트 메소드는 실행부가 있음
	// default 키워드가 리턴 타입 앞에 붙음

	// 상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 추상 메소드
	void turnOn();

	void turnOff();

	void setVolume(int volume);

	// setMute 디폴트 인스턴스 메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
			// 추상 메소드 호출하면서 상수 필드 사용
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
}
