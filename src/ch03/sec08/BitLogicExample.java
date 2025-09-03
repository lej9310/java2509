package ch03.sec08;

public class BitLogicExample {

	public static void main(String[] args) {
		// 비트 논리 연산자
		// & (AND): 두 비트가 모두 1일 때만 1
		// | (OR): 두 비트 중 하나만 1이면 1
		// ^ (XOR): 두 비트가 다를 때 1
		// &#126; (NOT): 비트 반전(0->1, 1->0)

		System.out.println("45 & 25=" + (45 & 25));
		System.out.println("45 | 25=" + (45 | 25));
		System.out.println("45 ^ 25=" + (45 ^ 25));
		System.out.println("~45=" + (~45));

		System.out.println("=============================");
		// 부호 있는 바이트 타입을 부호 없는 정수로 변환
		byte receiveData = -120;

		// 정수 10의 2진수 값
		int num = 10;
		int num2 = 11;
		System.out.println(Integer.toBinaryString(num) + "---" + Integer.toBinaryString(num2));
		System.out.println("------------정수 10의 2진수 값---------------");

		// 2진수 1010, 1011에 대한 10진수값
		System.out.println("-------------- 2진수 1010, 1011에 대한 10진수값 --------------");
		byte[] dat= {0b1010,0b1011};
		for(byte b:dat) {
			//int로 출력하면 자동 변환됨
			int val=b;
			System.out.println(val);
		}
		
		System.out.println("=================================================");
		// 방법1: 비트 논리곱 연산으로 Unsigned 정수 얻기
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1);

		// 방법2: 자바 API를 이용해서 Unsigned 정수 얻기
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);

		// int를 byte로 변환할 때 데이터 손실(오버플로우) 발생할 수 있음
		// 8비트 최대값(127)
		int test = 136;
		byte btest = (byte) test;
		System.out.println(btest);
	}

}
