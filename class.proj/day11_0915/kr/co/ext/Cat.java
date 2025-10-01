package kr.co.ext;

public class Cat extends Animal {

	// 필드 선언
	private boolean indoor;

	// 기본 생성자
	// public Cat() {
	// }

	// 매개변수를 갖는 생성자
	public Cat(String name, int age, boolean indoor) {
		super(name, age);
		this.indoor = indoor;
		// System.out.println("이름: " + this.name + "\n나이: " + this.age + "\n실내묘: " +
		// this.indoor);
	}

	// 메소드 선언(오버라이딩)
	@Override
	public void makeSound() {
		super.makeSound();
		System.out.println("야옹");
	}
	
	public void climb() {
		System.out.println("야옹이가 점프합니다.");
	}

}
