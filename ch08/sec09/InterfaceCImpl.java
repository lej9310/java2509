package ch08.sec09;

//InterfaceA, InterfaceB를 상속받은 InterfaceC 상속
public class InterfaceCImpl implements InterfaceC {
	// 8.9. 인터페이스 상속
	// 인터페이스도 다른 인터페이스를 상속, 클래스와 달리 다중 상속 허용
	// public interface 자식인터페이스 extends 부모인터페이스1, 부모인터페이스2,.. (..)

	public void methodA() {
		System.out.println("ImterfaceCImpl-methodA() 실행");
	}

	public void methodB() {
		System.out.println("ImterfaceCImpl-methodB() 실행");
	}

	public void methodC() {
		System.out.println("ImterfaceCImpl-methodC() 실행");
	}

}
