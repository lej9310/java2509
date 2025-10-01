package ch07.sec07.exam3;

public class ChildExample {

	public static void main(String[] args) {
		// 7.7. 타입 변환 - 강제 타입 변환
		// 자식 타입은 부모 타입으로 자동 변환되지만, 반대로 부모 타입은 자식으로 자동 변환되지 않음
		// 캐스팅 연산자로 강제 타입 변환 >> 자식타입 변수 = (자식타입) 부모타입 객체;

		// 객체 생성 및 자동 타입 변환
		Parent parent = new Child();

		// Parent 타입으로 필드와 메소드 사용
		parent.field1 = "data1";
		parent.method1();
		parent.method2();

		// 불가능
		// parent.field2 = "data2";
		// parent.field3();

		// 캐스팅 연산자로 강제 타입 변환
		Child child = (Child) parent;

		// Child 타입으로 필드와 메소드 사용
		child.field2 = "data2";
		child.method3();

	}

}
