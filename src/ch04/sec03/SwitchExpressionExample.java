package ch04.sec03;

public class SwitchExpressionExample {

	public static void main(String[] args) {
		// switch문 표현식 사용
		// break 없애고 화살표&중괄호 사용

		char grade = 'B';
		System.out.println("grade: " + grade);

		// 예제 1.
		switch (grade) {
		case 'A', 'a' -> {
			System.out.println("우수 회원입니다.");
		}
		case 'B', 'b' -> {
			System.out.println("일반 회원입니다.");
		}
		default -> {
			System.out.println("손님입니다.");
		}
		}

		// 예제 2. 중괄호 안에 실행문이 하나만 있을 경우, 생략 가능
		switch (grade) {
		case 'A', 'a' -> System.out.println("우수 회원입니다.");
		case 'B', 'b' -> System.out.println("일반 회원입니다.");
		default -> System.out.println("손님입니다.");
		}

	}

}
