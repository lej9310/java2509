package ch05.sec08;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		// 객체를 참조하는 배열
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] == strArray[1]); //true: 같은 객체 참조
		System.out.println(strArray[0] == strArray[2]); // false: 다른 객체 참조
		// .equals(): 문자열만 비교할 때 사용
		System.out.println(strArray[0].equals(strArray[2])); // true: 문자열이 동일
	}

}
