package ch05.sec04;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// 5.4. null과 NullPointerException		
		// null: 참조 타입 변수가 아직 번지를 저장하고 있지 않다.
		// 초기화된 참조 변수는 stack 영역(메소드 호출 시 생성되는 frame이 저장되는 영역)에 생성

		// NullPointerException 발생하면 null 참조 변수가 사용되고 있음
		int[] intArray = null;
		intArray[0] = 10; // NullPointerException
		
		String str = null;
		System.out.println("총 문자 수: " + str.length()); // NullPointerException
		
	}

}
