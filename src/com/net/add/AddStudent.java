package com.net.add;

public class AddStudent {

	public AddStudent() {

		/*
		 * // ex1. 객체 생성: new 키워드 사용 Student std1 = new Student(); Student std2 = new
		 * Student();
		 * 
		 * System.out.println(std1); System.out.println(std2);
		 */

		/*
		 * // ex2. 객체 생성 및 속성 정의와 사용 Student2 std2 = new Student2(); std2.name = "홍길동";
		 * std2.age = 30; std2.studentId = "20250910";
		 * 
		 * System.out.println("name: " + std2.name); System.out.println("age: " +
		 * std2.age); System.out.println("studentId: " + std2.studentId);
		 */

		/*
		 * // ex3. 객체생성, 메소드 정의와 사용 Student3 std3 = new Student3(); std3.introduce();
		 * std3.study();
		 */

		/*
		 * // ex4. 생성자 Constructor // 선언부 >> int num; Student4 std4; // 구현부 >> num = 10;
		 * std4 = new Student4(); // 객체 생성: new로 생성자 만들고 자동 초기화
		 */

		/*
		 * // ex5. 객체 생성자에 매개값(args) 생성 -> 전달 및 사용 Student5 std5;
		 * 
		 * // 기본생성자 std5 = new Student5();
		 * 
		 * // 매개변수가 1개인 생성자 Student5 std5_a = new Student5("학생1 OOO");
		 * 
		 * // 매개변수가 2개인 생성자 Student5 std5_b = new Student5("학생2 OOO", 29);
		 * 
		 * // 매개변수가 3개인 생성자 Student5 std5_c = new Student5("학생3 OOO", 22, "20250910");
		 */

		// ex6. 종합_ 객체 생성, 필드 생성, 생성자에서 필드 초기화, 메소드 생성

		Student6 std6 = new Student6(); // new 생성자로 object 생성
		Student6 std6_a = new Student6("직장인1 OOO");
		Student6 std6_b = new Student6("20250910", "직장인2 OOO");
		Student6 std6_c = new Student6("20250910", "직장인3 OOO", 20);

		// 필드값 읽기
		System.out.println("=========");
		System.out.println(std6_a.name);
		System.out.println("=========");
		System.out.println(std6_b.name);
		System.out.println(std6_b.companyId);
		System.out.println("=========");
		System.out.println(std6_c.name);
		System.out.println(std6_c.companyId);
		System.out.println(std6_c.age);

		System.out.println("========= 메소드: 엑션 =========");
		std6_a.introduce();
		std6_b.study();
		std6_c.study();
	}
}
