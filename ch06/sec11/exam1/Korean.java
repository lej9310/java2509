package ch06.sec11.exam1;

public class Korean {
	// 6.11. final 필드와 상수
	// 인스턴스 필드와 정적 필드는 값 변경 가능하나, 값 변경 막고 읽기만 허용할 때 필요 =>final 필드와 상수 선언해서 사용
	// final field: 초기값 저장되면 최종값이 되어 실행 도중 수정 불가
	// final 타입 필드 [=초기값];

// 인스턴스 final 필드 선언
	final String nation = "대한민국"; // 고정값으로 선언 시 초기값
	final String ssn;

	// 인스턴스 필드 선언
	String name;

	// 생성자 선언
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
