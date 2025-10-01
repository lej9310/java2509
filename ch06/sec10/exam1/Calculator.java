package ch06.sec10.exam1;

public class Calculator {

	// 정적 멤버: static 키워드 추가
	// 메소드 영역의 클래스에 고정적으로 위치하는 멤버
	// 객체를 생성할 필요 없이 클래스를 통해 바로 사용 가능
	// 객체마다 가지고 있을 필요성이 없는 공용적인 필드는 정적 필드로 선언

	static double pi = 3.14159;

	static int plus(int x, int y) {
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}
}
