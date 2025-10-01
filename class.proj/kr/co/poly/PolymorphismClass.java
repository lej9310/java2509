package kr.co.poly;

import java.util.Iterator;

import kr.co.intr.Animal;
import kr.co.intr.Cat;
import kr.co.intr.Dog;

public class PolymorphismClass {
	public PolymorphismClass() {

		// 예제 1. 다형성 배열
		Animal[] animals = { new Dog("바둑이", 5, "진돗개"), new Cat("나비", 3, false), new Dog("댕댕이", 2, "푸들"),
				new Cat("까망이", 4, true) };

		// 예제 1-1. UpCasting ==============================================
		System.out.println("===== 동물소리 =====");

//		animals[0].makeSound();
//		animals[1].makeSound();
//		animals[2].makeSound();
//		animals[3].makeSound();
//		System.out.println("============\n");

		// for~each로 배열 반복
		for (Animal animal : animals) {
			animal.makeSound();
		}

		// 예제 1-2. DownCasting ==============================================
		// Dog만 wagTail을 갖고 있고, Cat만 climb을 갖고 있는 경우

		System.out.println("\n==== 동물들의 행동 ====");
		for (Animal animal : animals) {
			if (animal instanceof Dog) {
				// 타입 캐스팅
				Dog dog = (Dog) animal;
				dog.wagTail();
			} else if (animal instanceof Cat) {
				// 타입 캐스팅
				Cat cat = (Cat) animal;
				cat.climb();
			} else {
				System.out.println("개도 아니고, 고양이도 아님");
			}
		}

		// 예제 2. 다형성 메소드 호출 ==============================================
		playWithAnimal(new Dog("루피", 1, "비글"));
		playWithAnimal(new Cat("츄츄", 2, true));

	}

	// 예제 2-1.  다형성 메소드 - DownCasting
	public void playWithAnimal(Animal animal) {
		System.out.println("\n======= 동물들과 놀아주기 ======= ");
		if (animal instanceof Dog) {
			// 타입 캐스팅
			((Dog) animal).wagTail();	
		} else if (animal instanceof Cat) {
			// 타입 캐스팅
			((Cat) animal).climb();			
		} else {
			System.out.println("개도 아니고, 고양이도 아님");
		}
		
		animal.eat();
		animal.makeSound();
	}
}
