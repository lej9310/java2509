package test;

public class Prj_01 {
	public static void main(String[] args) {
		// 1. 변수선언, 데이터타입
		String name = "김철수";
		System.out.println("이름: " + name);

		int age = 20;
		System.out.println("나이: " + age);

		// 타입캐스팅(타입바꾸기)
		double height = 160;
		int height2 = (int) height;
		System.out.println("키: " + height2 + "/ (type casting 전: " + height + ")");

		String student = "yes";
		boolean result1 = (student == "yes");
		System.out.println("학생 여부: " + result1);

		char grade = 'A';
		System.out.println("성적: " + grade);
	}
}
