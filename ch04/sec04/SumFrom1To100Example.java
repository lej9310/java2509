package ch04.sec04;

public class SumFrom1To100Example {

	public static void main(String[] args) {
		// for문: 1~100까지 합

		// 합계 변수
		int sum = 0;
		// 카운터 변수
		int i;

		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("1 ~ " + (i - 1) + " 합: " + sum);
	}

}
