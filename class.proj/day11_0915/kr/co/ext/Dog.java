package kr.co.ext;

public class Dog extends Animal {

	// 필드 선언
	public String breeds;

	// 기본생성자
	// public Dog() {
	// }

	// 매개변수를 갖는 생성자
	public Dog(String name, int age, String breeds) {
		super(name, age);
		this.breeds = breeds;
		// this.breeds);
	}

	// 메소드 선언(오버라이딩)
	@Override
	public void makeSound() {
		super.makeSound();
		System.out.println("멍멍");
	}	
	
	public void wagTail() {
		System.out.println("멍멍이가 꼬리를 살랑 흔듭니다.");
	}

}
