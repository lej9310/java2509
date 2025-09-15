package kr.co.ext;

public class Animal {

	// Dog, Cat 자식 클래스의 공통된 필드 선언 ==============
	private String name;
	public int age;

	// name에 getter & setter 생성 =============
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 기본 생성자 선언 선언
	public Animal() {

	}

	// 매개변수를 갖는 생성자 선언 ==============
	public Animal(String name2, int age2) {
		this.name = name2;
		this.age = age2;
	}

	// 메소드 선언
	public void makeSound() {
		System.out.println("소리를 냅니다.");
	}

	public void wagTail() {
		System.out.println("멍멍이가 꼬리를 살랑 흔듭니다.");
	}

}
