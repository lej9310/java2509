package kr.co.poly;

import kr.co.ext.Animal;
import kr.co.ext.Cat;
import kr.co.ext.Dog;

public class PolyClass {

	public PolyClass() {

		// 업케스팅 ======================================
		// 다형성 배열 선언 ==============
		Animal[] animals = { new Dog("바둑이", 5, "진돗개"), new Cat("나비", 3, false), new Dog("체리", 2, "푸들"),
				new Cat("까망이", 4, true) };

		System.out.println("===== 다형성 배열로 구성된 부모객체의 값 접근하기 =====");

		// foreach ==============
		for (Animal animal : animals) {
			// 다형성 - 각각의 자식클래스에서 오버라이드된 메소드 호출
			System.out.println(animal.getName());
			animal.makeSound();
		}
		
		// 다운케스팅 ======================================
		System.out.println("===== 자식객체의 특성값 접근하기 =====");
		for (Animal animal : animals) {
			if (animal instanceof Dog) {
				// 임시 변수: 타입 캐스팅
				Dog myDog = (Dog) animal;			
				myDog.wagTail();;
			} else if(animal instanceof Cat) {
				Cat myCat = (Cat) animal;
				myCat.climb();
			}
			
		}
	}
}
