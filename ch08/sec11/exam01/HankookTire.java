package ch08.sec11.exam01;

// Tire 인터페이스 상속
public class HankookTire implements Tire {

	// 추상메소드 재정의
	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러 갑니다.");
	}

}
