package ch04.sec03;

public class SwitchValueExample {

	public static void main(String[] args) {
		// grade에 따라 switch된 점수를 score 변수에 대입

		String grade = "B";

		// 예제 1. Java11 이전 문법
		int score1 = 0;

		switch (grade) {
		case "A":
			score1 = 100;
			break;
		case "B":
			int result = 100 - 20;
			score1 = result;
			break;
		default:
			score1 = 60;
		}
		System.out.println("score1: " + score1);

		// 예제 2. Java 13부터 가능
		// break 없이 화살표,중괄호 사용
		// switch된 result를 yield 사용해서 score2에 할당
		int score2 = switch (grade) {
		case "A" -> 100;
		case "B" -> {
			int result = 100 - 20;
			yield result;
		}
		default -> 60;
		};
		System.out.println("score2: " + score2);
	}

}
