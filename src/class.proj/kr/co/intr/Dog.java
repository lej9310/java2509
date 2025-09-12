package kr.co.intr;

public class Dog extends Animal {

	String breeds;

	public Dog(String name, int age, String breeds) {
		// 부모 클래스 초기화: super()
		super(name, age);
		this.breeds = breeds;
	}

	public void wagTail() {
		System.out.println("강아지 이름: " + name + "\n>> Dog - 꼬리 흔들기");
	}

	// 오버라이딩 ========================
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Dog - " + this.name + "가 꼬리를 살랑살랑 흔들어요.");
	}

	// super에 eat & Dog에 오버라이딩
	@Override
	public void eat() {
		super.eat();
		System.out.println("Dog - " + this.name + "가 고기를 먹어요.");
	}

	@Override
	public void makeSound() {
		super.makeSound();
		System.out.println("Dog - " + this.name + "가 '멍!멍!' 소리를 내요.");
	}
}
