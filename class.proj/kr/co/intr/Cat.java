package kr.co.intr;

public class Cat extends Animal {

	boolean isIndoor;

	public Cat(String name, int age, boolean isIndoor) {
		// 부모 클래스 초기화: super()
		super(name, age);
		this.isIndoor = isIndoor;
	}

	public void climb() {
		System.out.println("고양이 이름: " + name + "\n>> Cat - 점프");
	}

	// 오버라이딩 ========================

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Cat - 실내묘: " + (isIndoor ? "예" : "아니요"));
	}

	// super에 eat & Cat에 오버라이딩
	@Override
	public void eat() {
		super.eat();
		System.out.println("Cat - " + this.name + "가 츄르를 먹어요.");
	}

	@Override
	public void makeSound() {
		super.makeSound();
		System.out.println("Cat - " + this.name + "가 '야옹~' 소리를 내요.");
	}

}
