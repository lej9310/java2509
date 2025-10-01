package ch02.sec12;

public class PrintExample {

	public static void main(String[] args) {

		// 콘솔로 변수값 출력
		int value = 123;

		// printf("형식 문자열", 값)
		// 정수
		System.out.printf("상품의 가격:%d원\n", value);
		// 6자리 정수, 왼쪽 빈자리 공백
		System.out.printf("상품의 가격:%6d원\n", value);
		// 6자리 정수, 오른쪽 빈자리 공백
		System.out.printf("상품의 가격:%-6d원\n", value);
		// 6자리 정수, 빈자리 0으로 채움
		System.out.printf("상품의 가격:%06d원\n", value);
		System.out.println("\n===============\n");
		
		double area = 3.14159 * 10 * 10;
		//%10.2f: 정수 7자리+소수점+소수점2자리, 왼쪽 빈자리 공백
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area);

		System.out.println("\n===============\n");
		String name = "홍길동";
		String job = "도적";
		// %-10s: 10자리 문자열, 오른쪽 빈자리 공백
		// %10s: 10자리 문자열, 왼쪽 빈자리 공백
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
		System.out.println("\n===============\n");				
	}

}
