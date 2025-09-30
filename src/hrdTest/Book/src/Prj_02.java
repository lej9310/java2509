package test;

public class Prj_02 {

	public static void main(String[] args) {
		// 산술연산자
				int a = 10;
				int b = 3;
				int result1 = a + b;
				System.out.println("더하기: " + result1);

				int result2 = a - b;
				System.out.println("빼기: " + result2);

				int result3 = a * b;
				System.out.println("곱하기: " + result3);

				int result4 = a / b;
				System.out.println("나누기: " + result4);

				int result5 = a % b;
				System.out.println("나머지: " + result5);

				System.out.println("==================================");
				// 비교연산자
				System.out.println(a > b);
				System.out.println(a == b);

				System.out.println("==================================");
				// 논리연산자 and(&&)
				if (a == 10 && b == 3) {
					System.out.println(true);
				} else {
					System.out.println(false);
				}

				System.out.println(a == 10 && b == 3);

				// 논리연산자 or(||): 왼쪽이 true이면 오른쪽을 아예 평가하지 않음
				System.out.println(a == 10 || b == 3);

				// 논리연산자 or(|): 왼쪽이 true여도 오른쪽을 반드시 평가함
				System.out.println(a == 10 | b == 3);

				System.out.println("==================================");
				// 증감연산자
				int x;
				x = a++;
				System.out.println("a = " + a);
				System.out.println("z = " + x);

				int y;
				y = b--;
				System.out.println("b = " + b);
				System.out.println("y = " + y);
			

	}

}
