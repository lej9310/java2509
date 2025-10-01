package ch04.sec06;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {
		// While(true){}: 무한반복 => 종료 코드 필요

		try (// 키보드 입력 도구: 표준 입력 스트림 System.in을 인수로 넘겨 객체 만들기
		Scanner scanner = new Scanner(System.in)) {
			boolean run = true;
			int speed = 0;

			// 1 입력: 속도 증가, 2 입력: 감소, 3 입력: 종료
			while (run) {
				System.out.println("=========================");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("=========================");
				System.out.println("선택: ");

				// 키보드 입력값 읽음
				String strNum = scanner.nextLine();

				if (strNum.equals("1")) {
					speed++;
					System.out.println("현재 속도 = " + speed);
				} else if (strNum.equals("2")) {
					speed--;
					System.out.println("현재 속도 = " + speed);
				} else if (strNum.equals("3")) {
					run = false;
				}
			}
		}
		
		System.out.println("프로그램 종료");

	}

}
