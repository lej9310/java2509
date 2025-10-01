package ch05.sec05;

public class SplitExample {

	public static void main(String[] args) {
		// 5.5. 문자열(String) 타입 - 문자열 분리
		// split(): 구분자를 사용하여 여러 개 문자열로 구성되어 있을 경우, 따로 분리

		String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
		System.out.println("String board: "+ board);
		
		// 문자열 분리
		String[] tokens = board.split(",");

		System.out.println("======================");
		// 인덱스별로 읽기
		System.out.println("번호: " + tokens[0]);
		System.out.println("제목: " + tokens[1]);
		System.out.println("내용: " + tokens[2]);
		System.out.println("성명: " + tokens[3]);
		System.out.println();

		// for문을 이용한 읽기
		System.out.println("======================");
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}

	}

}
