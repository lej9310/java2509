package ch07.sec03.exam1;

class Phone {

	// 7.3. 부모 생성자 호출 >> super();
	// 부모 생성자는 자식 생성자의 맨 첫 줄에 숨겨져 있는 super()에 의해 호출
	// super는 컴파일 과정에서 자동 추가

	// 예제. 부모 클래스가 기본 생성자를 가지고 있는 경우
	
	// 필드 선언
	public String model;
	public String color;
	
	// 기본 생성자 선언
	public Phone() {
		System.out.println("Phone() 생성자 실행");
	}
}
