package ch09.sec03.exam01;

public class AExample {

	public static void main(String[] args) {
		
		// A 클래스 외부에서 B 객체를 생성하려면 A 객체 생성 없이 A 클래스로 접근해서 B 객체를 생성
		// B 객체 생성
		A.B b = new A.B();

	}

}
