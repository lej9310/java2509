package ch03.sec11;

public class ConditionlOperationExample {

	public static void main(String[] args) {
		// 삼항(조건) 연산자

		// 95점은 A등급입니다.
		int score2 = 95;
		char grade2 = (score2 > 90) ? 'A' : ((score2 > 80) ? 'B' : 'C');
		System.out.println(score2 + "점은 " + grade2 + "등급입니다.");

		// 85점은 B등급입니다.
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");

	}

}
