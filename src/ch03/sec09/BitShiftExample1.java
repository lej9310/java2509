package ch03.sec09;

public class BitShiftExample1 {

	public static void main(String[] args) {
		// 비트 이동 연산자

		int num1 = 1;

		// 왼쪽쉬프트(<<): 비트의 자리 옮김. 0001의 왼쪽으로 3칸 이동하면 1000(8)이 됨.
		int result1 = num1 << 3;
		
		// Math.pow(2, 3): 
		int result2 = num1 * (int) Math.pow(2, 3);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);

		System.out.println("======================");
		int num2 = -8;
		int result3 = num2 >> 3;
		int result4 = num2 / (int) Math.pow(2, 3);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);

	}

}
