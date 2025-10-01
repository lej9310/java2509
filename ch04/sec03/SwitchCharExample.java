package ch04.sec03;

public class SwitchCharExample {

	public static void main(String[] args) {
		// swith

		// char 타입: 대소문자 관계 없음
		char grade = 'a';

		switch (grade) {
		case 'A':
		case 'a':
			System.out.println(grade + "등급 " + "우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println(grade + "등급 " + "일반 회원입니다.");
			break;
		default:
			System.out.println(grade + "등급 " + "손님입니다.");

		}

	}

}
