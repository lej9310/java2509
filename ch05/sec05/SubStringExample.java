package ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {
		// 5.5. 문자열(String) 타입 - 문자열 잘라내기
		// substring(): 특정위치의 문자열 잘라내서 가져오기

		String ssn = "880815-1234567";

		// 예제1. substring(int beginindex, int endindex): beginindex에서 endindex까지 잘라내기
		// 문자열 인텍싱은 0부터 시작
		String firstNum = ssn.substring(0, 6); //880815
		System.out.println(firstNum);

		// 예제2. substring(int beginindex): beginindex에서 끝까지 잘라내기
		String secondNum = ssn.substring(7);
		System.out.println(secondNum); //1234567
	}

}
