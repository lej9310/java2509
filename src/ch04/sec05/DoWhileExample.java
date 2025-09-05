package ch04.sec05;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// do-while문: 블록 내부를 먼저 실행시키고, 실행 결과에 따라서 반복 실행을 계속할지 결정
		// while() 뒤에 반드시 세미콜론(;) 붙이기!!

		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");

		try (Scanner scanner = new Scanner(System.in)) {
			String inputString;

			do {
				System.out.print(">");
				inputString = scanner.nextLine();
				System.out.println(inputString);
			} while (!inputString.equals("q"));
		}
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
