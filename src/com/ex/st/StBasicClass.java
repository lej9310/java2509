package com.ex.st;

public class StBasicClass {

	public StBasicClass() {
		/*
		 * // ex1.
		 * 
		 * Student st1 = new Student(); //Student st1 = null; //String str = null; //int
		 * num = 0; //char ch1 = 0;
		 * 
		 * System.out.println(st1); //System.out.println(str);
		 * //System.out.println(num); //System.out.println(ch1);
		 */

//	// ex2.
//	Student2 st2 = new Student2();
//	st2.name = "김철수";
//	st2.age = 20;
//	st2.studentId = "20250701";
//
//	System.out.println(st2.name);
//	System.out.println(st2.age);
//	System.out.println(st2.studentId);

		/*
		 * // ex3. 메소드 Student3 st3 = new Student3(); st3.study(); st3.introduce();
		 */

		/*
		 * // ex4. Student4 st4 = new Student4();
		 */

		/*
		 * //ex5. Student5 st5; st5 = new Student5("은정");
		 */

		/*
		 * // ex6. 종합 Student6 st6; st6 = new Student6();
		 * 
		 * Student6 st6_1 = new Student6(); Student6 st6_2 = new Student6("김철수",
		 * "20250909"); Student6 st6_3 = new Student6("김영희", 20, "20250910");
		 * 
		 * st6_2.study(); st6_3.introduce(); System.out.println("===============");
		 * st6_3.study(); st6_2.introduce();
		 */

		// ex7. getter & setter
		Student7 st7 = new Student7();
		System.out.println(st7.toString());
		System.out.println("============");

		st7.setName("이은정");
		st7.age = 26;
		st7.setStudentId("2020010811");
		System.out.println(st7.toString());
	}

}
