package ch04.sec02;

public class IfExample {

	public static void main(String[] args) {
		// if문: 조건의 결과에 따라 블록 실행 여부 결정
		// true이면 블록 실행 - false이면 블록 실행하지 않음

		int score = 93;

		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급(score)은 A입니다.");
		}

		// if문과는 상관 없이 실행
		if (score < 90)
			System.out.println("점수가 90보다 작습니다.");
		System.out.println("등급은 B입니다.");

		System.out.println("=========================");
		int score2 = 80;
		//
		if (score2 < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급(score2)은 B입니다.");
		}

	}

}
