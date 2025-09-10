package ch06.sec08.exam4;

public class CalculatorExample {

	public static void main(String[] args) {
		// 예제. areRectangle() 메소드를 오버로딩해서 매개값이 한 개면 정사각형의 넓이를,
		// 매개값이 두 개면 직사각형의 넓이 계산
		
		// 객체 생성
		Calculator myCalcu = new Calculator();

		// 정사각형의 넒이 구하기 // areaRectangle(double width) 실행
		double result1 = myCalcu.areaRectangle(10);

		// 직사각형의 넒이 구하기 // areaRectangle(double width, double height) 실행
		double result2 = myCalcu.areaRectangle(10, 20);

		System.out.println("정사각형의 넒이=" + result1);
		System.out.println("직사각형의 넒이=" + result2);

	}

}
