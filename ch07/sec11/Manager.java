package ch07.sec11;

// Person 상속 //non-sealed 클래스(봉인 해제) // 자식 클래스 생성 가능
public non-sealed class Manager extends Person {
	@Override
	public void work() {
		System.out.println("생산 관리를 합니다.");
	}
}
