package ch05.sec05;

public class Index0fContainsExample {

	public static void main(String[] args) {
		// 5.5. 문자열(String) 타입 - 문자열 찾기
		// indexOf()

		String subject = "자바 프로그래밍";

		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		System.out.println("==============================");
		String substring = subject.substring(location);
		System.out.println(substring);

		System.out.println("==============================");
		location = subject.indexOf("자바");
		System.out.println(location); // 문자열 포함:0 / 불포함:-1
		
		if (location != -1) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}

		System.out.println("==============================");
		boolean result = subject.contains("자바");
		if (result) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}

	}

}
