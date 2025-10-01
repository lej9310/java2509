package kr.co.interf;

import kr.co.intr.Animal;

// 구현 클래스 선언. 인터페이스 여러개 사용
public class Bird extends Animal implements Flyable, Walkable {

	public Bird(String name, int age, double d) {
		// 부모 클래스 초기화 ===================
		// 방법1. super(name, age);
		super(); // 방법2. 부모 클래스 Animal에 없음 >> 기본생성자 생성

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
