package ch07.sec07.exam2;

public class Child extends Parent {
	// 메소드 오버라이딩
	@Override
	public void method2() {
		System.out.println("Child-mehtod2()");
	}

	// 메소드 선언
	public void method3() {
		System.out.println("Child-method3()");
	}

}
