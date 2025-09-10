package ch06.sec08.exam4;

public class Calculator {

	// 메소드 오버로딩
	// 메소드 이름은 같되 매개변수의 타입, 개수, 순서가 다른 메소를 여러개 선언
	
	// 정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}

	// 직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}

}
