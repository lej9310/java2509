package ch08.sec10.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		
		//8.10. 타입 변환
		// 자동 타입 변환(promotion) >> 인터페이스 변수 = 구현객체;
		// B, C, D, E 클래스로부터 생성된 객체는 모두 인터페이스 A로 자동 타입 변환 가능
		
		// 구현 객체 생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		// 인터페이스 변수 선언
		A a;

		// 변수에 구현 객체 대입
		a = b; // (자동 타입 변환)
		a = c; // (자동 타입 변환)
		a = d; // (자동 타입 변환)
		a = e; // (자동 타입 변환)

	}

}
