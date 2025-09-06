package ch05.sec05;

public class ReplaceExample {

	public static void main(String[] args) {
		// 5.5. 문자열(String) 타입 - 문자열 대체
		// replace():기존 문자열은 그대로 두고, 대체한 새로운 문자열 리턴
		
		// String 객체의 문자열은 변경 불가
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		// replace() 리턴하는 문자열은 수정본이 아니라, 완전히 새로운 문자열
		String newStr = oldStr.replace("자바", "JAVA");

		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
