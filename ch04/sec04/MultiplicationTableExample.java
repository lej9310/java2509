package ch04.sec04;

public class MultiplicationTableExample {

	public static void main(String[] args) {
		// For문: 구구단 출력

		for (int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 1; n < 9; n++) {
				System.out.println(m + "x" + n + " = " + (m * n));
			}
		}

	}

}
