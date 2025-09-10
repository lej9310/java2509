package ch06.sec10.exam2;

public class Television {

	// 정적 블록 static {...}
	// 정적 필드: 필드 선언과 동시에 초기값을 줌

	// 3개의 정적 필드
	// company & model: 선언 시 초기값,
	static String company = "MyCompany";
	static String model = "LCD";
	// info: 정적 블록에서 company와 model을 연결하여 초기값
	static String info;

	// 정적 블록: 클래스가 메모리로 로딩될 때 자동 실행
	// 정적 블록 여러 개 선언 시, 순서대로 실행
	static {
		info = company + "-" + model;
	}

}
