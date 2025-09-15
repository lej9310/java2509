package ch08.sec04;

//구현 클래스인 Audio은 인터페이스에 선언된 모든 추상 메소드를 재정의(오버라이딩)해서 실행 코드를 가져야 함.
public class Audio implements RemoteControl {

	// 필드 선언 =========================================
	private int volume;

	// 메소드 재정의 >> 오버라이드 메소드는 모두 public =========================================
	// 추상 메소드는 기본적으로 public 접근 제한
	// => 추상 메소드를 재정의할 때 더 낮은 접근 제한으로 재정의 할 수 없음

	// turnOn() 추상 메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	// turnOff() 추상 메소드 오버라이딩
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	// setVolume() 추상 메소드 오버라이딩
	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOUME) {
			this.volume = RemoteControl.MAX_VOUME;
		} else if (volume < RemoteControl.MIN_VOUME) {
			this.volume = RemoteControl.MIN_VOUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}
}
