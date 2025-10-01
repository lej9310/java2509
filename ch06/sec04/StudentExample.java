package ch06.sec04;

public class StudentExample {

	public static void main(String[] args) {
		// 객체지향 프로그래밍 - 6.4. 객체 생성과 클래스 변수
		// 클래스로부터 객체를 생성하려면 객체 생성 연산자인 new 클래스();

		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");

		Student s2 = new Student();

		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");

	}

}
