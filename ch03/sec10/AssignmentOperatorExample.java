package ch03.sec10;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		// 대입 연산자: 우측 피연산자의 값을 좌측 피연산자 변수에 대입

		// 더하기
		int result = 0;
		result += 10;
		System.out.println("result= " + result);
		System.out.println("============================");

		// 빼기
		result -= 5;
		System.out.println("result= " + result);
		System.out.println("============================");

		// 곱하기
		result *= 3;
		System.out.println("result= " + result);
		System.out.println("============================");

		// 나누기
		result /= 5;
		System.out.println("result= " + result);
		System.out.println("============================");

		// 나눈 후 나머지를 변수에 저장
		result %= 3;
		System.out.println("result= " + result);
		System.out.println("============================");
	}

}
