package ch04.sec08;

public class ContinueExample {

	public static void main(String[] args) {
		// continue문: 반복문(for, while, do-while)에서만 사용
		// 블록 내부에서 실행되면 조건식으로 바로 이동
		
		for (int i = 1; i <= 10; i++) {			
			// 2로 나눈 나머지가 0이 아닐 경우(홀수),
			if (i % 2 != 0) {
				// 조건식 i++로 바로 이동 => 밑은 실행되지 않음
				continue;
			}
			
			System.out.print(i + " ");
		}

	}

}
