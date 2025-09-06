package ch04.sec03;

public class SwithNoBreakCaseExample {

	public static void main(String[] args) {
		// switch문에서 case 끝에 break 없으면 해당 case부터 다음 case 연달아 실행됨

		// 랜덤번호 8~11
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("[현재 시간: " + time + "시]");

		switch (time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");

		}

	}

}
