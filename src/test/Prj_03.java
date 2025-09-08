package test;

public class Prj_03 {

	public static void main(String[] args) {
		// if문, swich문, break
		int score = 85;

		if (score >= 85) {
			System.out.println("score: " + score + "/ Grade: A");
		} else if (score >= 75 && score < 85) {
			System.out.println("score: " + score + "/ Grade: B");
		} else {
			System.out.println("score: " + score + "/ Grade: C");
		}

		String grade = (score >= 85) ? "A" : "B";
		System.out.println("score: " + score + "/ grade: " + grade);

		// A일때만 수행할 로직
		if ("A".equals(grade)) {
			System.out.println("score: " + score + "/ Grade: A");
		}

		System.out.println("======================================");
		// 방법 1. switch에 점수를 10으로 나눈 몫 사용
		int score2 = 75;

		switch (score2 / 10) {
		case 10:
		case 9:
			System.out.println("Grade : A / score : " + score2);
			break;
		case 8:
			System.out.println("Grade : B / score : " + score2);
			break;
		case 7:
			System.out.println("Grade : C / score : " + score2);
			break;
		default:
			System.out.println("Grade : F / score : " + score2);
			break;
		}

		// 방법 2. 등급 문자열을 먼저 계산하고, 문자열 switch 사용
		String grade1 = (score2 >= 90) ? "A" : (score2 >= 80) ? "B" : (score2 >= 70) ? "C" : "F";

		switch (grade1) {
		case "A":
			System.out.println("Grade : A / score : " + score2);
			break;
		case "B":
			System.out.println("Grade : B / score : " + score2);
			break;
		case "C":
			System.out.println("Grade : C / score : " + score2);
			break;
		default:
			break;
		}

	}

}
