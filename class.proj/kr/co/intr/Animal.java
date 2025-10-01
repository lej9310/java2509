package kr.co.intr;

// 개와 고양이의 공통된 값과 엑션
public class Animal {

	String name;
	int age;

	public Animal() {

	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;

	}

	// dog과 cat의 공통을 부모 클래스로
	public void displayInfo() {
		System.out.println("Animal - 정보 출력");
	}

	public void eat() {
		System.out.println("Animal - 먹기");
	}

	public void makeSound() {
		System.out.println("Animal - 소리내기");
	}

}
