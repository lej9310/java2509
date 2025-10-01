package ch07.sec11;

// Manager 상속
public class Director extends Manager {
	@Override
	public void work() {
		System.out.println("제품을 기획합니다.");
	}
}
