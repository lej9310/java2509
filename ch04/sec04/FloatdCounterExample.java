package ch04.sec04;

public class FloatdCounterExample {

	public static void main(String[] args) {
		// For문: 초기화식에서 부동 소수점을 쓰는 float 타입 사용하지 말것
		// float 타입은 연산 과정에서 정확히 0.1을 표현하지 못함
		// => 증감식에서 x값에 더해지는 실제 값은 0.1보다 약간 클 수 있음

		for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}

	}

}
