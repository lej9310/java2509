package ch07.sec07.exam2;

public class ChildExample {

	public static void main(String[] args) {
		
		// 자식 객체 생성
		Child child = new Child();
		
		// 부모 타입으로 자동 타입 변환
		Parent parent = child;

		// 부모 타입으로 자동 타입 변환된 이후에는 부모 클래스에 선언된 필드/메소드만 접근 가능(method1 & method2)
		// 자식클래스에서 오버라이팅한 메소드(method2)가 있다면 부모 대신 오버라이딩된 메소드를 호출
		// 메소드 호출
		parent.method1(); // >> Parent-method1()
		parent.method2(); // 자식 클래스 메소드 오버라이딩 >> Child-mehtod2()
		//parent.method3(); // 부모 클래스에 없는 메소드 >> 호출 불가능

	}

}
