package kr.co.interf;

import kr.co.intr.Animal;

//구현 클래스 선언. 인터페이스 여러개 사용
public class Duck extends Animal implements Flyable, Walkable, Swimmable {

	public Duck(String name, int age) {
		// 부모 클래스 초기화 ===================
		// 부모 클래스 Animal에 있음 >> super(); 생략 가능
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dive() {
		// TODO Auto-generated method stub

	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}

}
