package kr.co.overload;

public class Calculator {

	// 메소드 ========================================
	// 예제1. return 값이 있는 메소드 --- int 타입
	public int add(int x, int y) {
		++cnt;
		System.out.println("calc1.add: return 값이 있는 메소드");
		return x + y;
	}

	// 예제2. return 값이 없는 메소드
	public void add1(int x, int y, double d) {
		++cnt;
		System.out.println("clalc.add1: return 값이 없는 메소드 실행");
		System.out.println(x + y + d);
	}

	// 예제3. return 값이 있는 메소드 --- 매개변수 double 2개
	public double add(double x, double y) {
		++cnt;
		System.out.println("메소드 오버로드: 매개변수 실수 2개");
		return x + y;
	}

	// 예제 4. return 값이 있는 메소드 --- 매개변수 int 3개
	public int add(int x, int y, int z) {
		++cnt;
		System.out.println("메소드 오버로드: 매개변수 정수 3개");
		return x + y + z;
	}

	// 정적필드/메소드(static) ========================================
	static int cnt = 0;
	// public static int total;

	// 카운트 게터
	public static int getCnt() {
		return cnt;
	}

	// Cnt 초기화
	public static void iniCnt() {		
		cnt = 0;
	}

}
