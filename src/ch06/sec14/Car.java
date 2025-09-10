package ch06.sec14;

public class Car {

	// 6.14. Getter & Setter
	// 객체의 무결성을 위해 외부에서 필드 접근은 막고, 메소드를 통해 필드에 접근
	// Setter : 메소드가 데이터를 검증해서 유효한 값만 필드에 저장
	// Getter : 필드값이 객체 외부에서 사용하기에 부적절한 경우, 메소드로 변환해서 리턴

	private int speed;
	private boolean stop;

	// speed 필드의 Getter/Setter 선언
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}

// stop 필드의 Getter/Setter 선언
	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		if (stop == true)
			this.speed = 0;

	}
}
