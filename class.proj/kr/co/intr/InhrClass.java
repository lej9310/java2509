package kr.co.intr;

public class InhrClass {
	public InhrClass() {

		// 생성자
		Dog dog = new Dog("멍멍이", 3, "골든리트리버");
		Cat cat = new Cat("야옹이", 2, true);

		System.out.println("==== 개 ===");
		dog.displayInfo(); //super >> Animal & 오버라이딩 >> Dog
		dog.eat();         //super >> Animal & 오버라이딩 >> Dog
		dog.makeSound();   //super >> Animal & 오버라이딩 >> Dog
		dog.wagTail();

		System.out.println("==== 고양이 ===");
		cat.displayInfo();  //super >> Animal & 오버라이딩 >> Cat
		cat.eat();          //super >> Animal & 오버라이딩 >> Cat
		cat.makeSound();    //super >> Animal & 오버라이딩 >> Cat
		cat.climb();

	}

}
