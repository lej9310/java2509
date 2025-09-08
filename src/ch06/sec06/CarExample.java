package ch06.sec06;

public class CarExample {

	public static void main(String[] args) {
		// 객체지향 프로그래밍 - 6.5. 클래스의 구성 멤버
		// 필드(상태): 객체의 데이터가 저장되는 곳
		// 생성자: 객체 생성 시 초기화 역할 담당
		// 메소드(행동): 객체의 동작으로 호출 시 실행하는 블록

		// Car 객체 생성
		Car myCar = new Car();

		// Car 객체의 필득값 읽기
		System.out.println("모델명: " + myCar.model);
		System.out.println("시동여부: " + myCar.start);
		System.out.println("현재속도: " + myCar.speed);
	}

}
