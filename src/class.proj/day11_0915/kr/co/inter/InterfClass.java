package kr.co.inter;

import kr.co.ext.Bird;
import kr.co.ext.Duck;

public class InterfClass {
	public InterfClass() {
		Bird bird = new Bird("참새", 1, 25.5);
		Duck duck = new Duck("도널드", 3);

		System.out.println("\n=============");
		bird.makeSound();
		bird.walk();
		bird.fly();
		duck.makeSound();
		duck.walk();
		duck.swim();

		System.out.println("\n=============");
		// 인터페이스 타입으로 사용해보자
		Walkable[] walkAnimals = { bird, duck };
		for (Walkable walkAnimal : walkAnimals) {
			walkAnimal.walk();
		}

		// 다형성 인터페이스
		testWalk(bird);
		testWalk(duck);
		testSwim(duck);
	}

	private void testSwim(Swimmable swimmer) {
		swimmer.swim();
	}

	// 생성자 밖에 메소드 선언 ===================================
	public static void testWalk(Walkable walker) {
		walker.walk();
	}

}
