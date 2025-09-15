package ch08.sec04;

// 패키지에서 우클릭 >> New >> Interface
public interface RemoteControl {
	//8.4. 추상 메소드
	// 리턴 타입, 메소드명, 매개변수만 기술되고 중괄호{}가 없는 메소드
	
	// 상수 필드
	int MAX_VOUME = 10;
	int MIN_VOUME = 0;
	
	// 추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);

}
