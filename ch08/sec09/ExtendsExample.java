package ch08.sec09;

public class ExtendsExample {

	public static void main(String[] args) {

		// 생성자 선언 =======
		InterfaceCImpl impl = new InterfaceCImpl();

		// 구현 개체가 "부모" 인터페이스 변수에 대입되면,
		// => 부모 인터페이스에 선언된 추상 메소드만 호출 가능 ===============
		InterfaceA ia = impl;
		ia.methodA();
		// ia.methodB();
		System.out.println();

		InterfaceB ib = impl;
		// ia.methodA();
		ib.methodB();
		System.out.println();

		// 구현 객체가 "자식" 인터페이스 변수에 대입되면, ======================
		// => 자식 및 부모 인터페이스의 추상 메소들르 모두 호출 가능
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
