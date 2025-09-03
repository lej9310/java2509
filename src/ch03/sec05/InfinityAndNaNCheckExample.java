package ch03.sec05;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// 나눗셈 연산 후 NaN과 Infinity 처리
		int x = 5;
		
		double y = 0.0;
		//double y = 1;
		
		double z = x / y;
		// 잘못된 코드
		// double z = x%y
		System.out.println(z + 2);

		// 알맞은 코드
		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z + 2);
		}

	}

}
