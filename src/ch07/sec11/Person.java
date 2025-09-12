package ch07.sec11;

// 7.11. 봉인된 클래스
// final 클래스 외 모든 클래스는 부모 클래스가 될 수 있음
// 무분별한 자식 클래스 생성 방지 => sealed 클래스 생성
// permits 뒤, 상속 가능한 자식 클래스 지정
public sealed class Person permits Employee, Manager {
	
	// 필드
	public String name;
	
	// 메소드
	public void work() {
		System.out.println("하는 일이 결정되지 않았습니다.");
	}

}
