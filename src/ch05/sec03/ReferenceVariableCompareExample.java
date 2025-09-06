package ch05.sec03;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		// 5.3. 참조 타입 변수의 ==, != 연산
		// 배열의 내용이 아니라, 배열이 저장된 메모리 주소(참조, reference)를 비교
		// 변수가 가리키는 객체가 동일(같은 객체 참조)/상이(다른 객체 참조)한지 비교
		
		// 배열 변수 선언
		int[] arr1;
		int[] arr2;
		int[] arr3;

		// 배열 생성 및 변수에 대입
		arr1 = new int[] { 1, 2, 3 };
		arr2 = new int[] { 1, 2, 3 };
		arr3 = arr2; 

		// arr1과 arr2는 위에서 각각 새 배열 객체를 별도 생성 => 다른 메모리 위치 참조 
		System.out.println(arr1 == arr2); //false
		System.out.println(arr2 == arr3); // true
	}

}
