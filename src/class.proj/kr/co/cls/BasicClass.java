package kr.co.cls;

public class BasicClass {
	public BasicClass() {

		// 예제 1. ======================================
		// new 연산자로 객체 생성
//		Student st1 = new Student();
//		Student st2 = new Student();

		// 필드에 접근하여 값을 할당
//		st1.name = "김철수";
//		st1.age = 20;
//		st1.studentId = "20250912";
//		st2.name = "이영희";
//		st2.age = 24;
//		st2.studentId = "20250913";		

		// 메소드(클래스 안에 있는 함수) 호출
		/*
		 * st1.introduce(); st1.study(); System.out.println("\n"); st2.introduce();
		 * st2.study();
		 */
		

		// 예제2. ====================================
		// 객체 생성과 초기화
		Student std1 = new Student("김철수", 20, "20250912");
		Student std2 = new Student("이영희", "20250913");

		// 예제3. getters & setters ====================================
		std1.setName("김갑수");
		System.out.println("~~~" + std1.getName());

		String myName = std2.getName();
		System.out.println("myName:" + myName);
	}

}
