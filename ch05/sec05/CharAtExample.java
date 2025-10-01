package ch05.sec05;

public class CharAtExample {

	public static void main(String[] args) {
		// 5.5. 문자열(String) 타입 - 문자 추출
		// charAt(): 특정 위치의 인덱스(0 ~ 문자열길이-1) 리턴
				
		String ssn = "9506241230123";
		
		//char sex = ssn.charAt(6);
		char sex = ssn.charAt(7);
		System.out.println("sex: " + sex);
		
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}

	}

}
