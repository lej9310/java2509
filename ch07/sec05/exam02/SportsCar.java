package ch07.sec05.exam02;

// 부모 클래스 상속
public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}

	// 부모 클래스  Car에서 final 메소드임으로 오버라이딩 할 수 없음 >> 컴파일 에러
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}

}
