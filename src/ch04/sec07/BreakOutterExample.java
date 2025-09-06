package ch04.sec07;

public class BreakOutterExample {

	// throws Exception은 해당 메서드가 처리하지 않은(try-catch로 잡지 않은) 예외를 바깥으로 던진다는 선언
	public static void main(String[] args) throws Exception {
		// break문
		// 반복문이 중첩되어 있을 경우, 가까운 반복문만 종료하고 바깥쪽은 종료 안 함
		// 바깥쪽 반복문에 레이블 붙이고, break 이름;

		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {

				System.out.println(upper + "-" + lower);

				// 소문자 g가 나오면 종료
				if (lower == 'g') {
					break Outter;
				}
			}

		}
		System.out.println("프로그램 실행 종료");
		System.out.println("=============================");

		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			char lower = Character.toLowerCase(upper);
			System.out.println(upper + "-" + lower);

			// 소문자 g가 나오면 종료
			if (lower == 'c') {
				break Outter;
			}

		}

	}

}
