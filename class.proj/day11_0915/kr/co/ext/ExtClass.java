package kr.co.ext;

public class ExtClass {

	public ExtClass() {
		// 객체 생성		
		//	Dog dog = new Dog();
		//	Cat cat = new Cat();
		Dog dog = new Dog("멍멍이", 3, "골든리트리버");
		Cat cat = new Cat("야옹이", 2, true);

		// System.out.println(dog.name);
		System.out.println(dog.getName());  // getter & setter
		System.out.println(dog.breeds);
		
		
		// 메소드 선언
		System.out.println();
		dog.makeSound();
		cat.makeSound();
	}
}
