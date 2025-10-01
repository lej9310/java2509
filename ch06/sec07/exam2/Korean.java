package ch06.sec07.exam2;

public class Korean {

	// 필드 선언
	String nation = "대한민국";
	String name; // 사람마다 다르므로 초기화
	String ssn;  // 사람마다 다르므로 초기화

	// 생성자 선언
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
