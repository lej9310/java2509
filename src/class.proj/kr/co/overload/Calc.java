package kr.co.overload;

public class Calc {

	public Calc() {
		
		int resultCnt = Calculator.getCnt();
		System.out.println("resultCnt 연산 전: " + resultCnt);

		Calculator calc1 = new Calculator();
		Calculator calc2 = new Calculator();

		// 메소드 ========================================
		// 자바는 데이터 타입이 중요!
		// 변수 타입에 var: 초기값을 줬을때 사용

		// 예제1. return 값이 있는 메소드 - int 타입
		int result1 = calc1.add(5, 3);
		System.out.println(result1);

		// 예제2. return 값이 없는(void) 메소드
		calc1.add1(5, 3, 0.1);

		// 예제3. return 값이 있는 메소드 --- 매개변수 double 2개
		// 타입이 변경되면 calc1에서 생성한 add 메소드를 그대로 사용할 수 없음!
		double result2 = calc2.add(2.2, 2.3);
		System.out.println(result2);

		// 예제 4. return 값이 있는 메소드 --- 매개변수 int 3개
		int result3 = calc2.add(5, 3, 2);
		System.out.println(result3);

		// 정적필드/메소드(static) ========================================
		// calc1.cnt = 100; // 컴파일 에러
		// Calculator.cnt = 100;
		// Calculator.total = 1000;

		// static --- 리턴값 있는 메소드
		int resultCnt2 = Calculator.getCnt();
		System.out.println("resultCnt2 연산 후: " + resultCnt2);

		// 리턴값 없는 메소드
		Calculator.iniCnt();
		System.out.println("resultCnt 초기화: " + resultCnt);

	}

}
