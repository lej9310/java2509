package test;

public class Prj_04 {

	public static void main(String[] args) {
		// for문. 구구단 출력
		for (int i = 1; i < 10; i++) {
			int result = 9 * i;
			System.out.println("9*" + i + "=" + result);
		}

		System.out.println("========== 전체 구구단 출력 ==========");
		// 2단~9단
		for (int dan = 2; dan < 10; dan++) {
			System.out.println("[" + dan + "]");
			// 단*i
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + "*" + i + "=" + (dan * i));
			}
			System.out.println();

		}

	}

}
