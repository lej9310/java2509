package ch07.sec11;

// Person 상속 // final 클래스(더이상 상속할 수 없음)
public final class Employee extends Person {

	@Override
	public void work() {
		System.out.println("제품을 생산합니다.");
	}

}
