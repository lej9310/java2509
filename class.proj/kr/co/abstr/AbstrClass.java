package kr.co.abstr;

// 추상 클래스 연습
public class AbstrClass {	
	public AbstrClass() {
		
		// 도형 만들기: 색(color), 크기(x,y), 반지름(r), 가로세로(w,h)
		Circle circle = new Circle("red", 10.0, 10.0, 5.0);
		Rectangle rectangle = new Rectangle("blue", 30.0, 10.0, 8.0, 5.0);
		
		System.out.println(circle.getShapeType());
		System.out.println(rectangle.getShapeType());
	}
}
