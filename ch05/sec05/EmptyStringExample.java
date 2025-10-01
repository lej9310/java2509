package ch05.sec05;

public class EmptyStringExample {

	public static void main(String[] args) {
		// 5.5. 문자열(String) 타입 - 문자열 비교

		// 빈 문자열 비교
		String hobby = "";
		
		if (hobby.equals("")) {
			System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
		}

	}

}
