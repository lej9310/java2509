package ch04.sec05;

public class SumFromTo100Example {

	public static void main(String[] args) {
		// while문: 1부터 100까지 합계

		// 합계변수
		int sum = 0;
		// 카운터 변수
		int i = 1;

		while (i <= 100) {
			sum += i;
			i++;
		}

		System.out.println("1 ~ " + (i - 1) + " 합 : " + sum);

	}

}
