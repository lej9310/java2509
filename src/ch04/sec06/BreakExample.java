package ch04.sec06;

public class BreakExample {

	public static void main(String[] args) {
		// break문
				
		// while문을 이용해서 랜덤 번호 생성하고, 		
		while (true) {
			//Math.random(): 0.0-1.0 미만 랜덤 실수(double) 반환
			//캐스팅: (int)형 정수로 0변환
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			
			// 6이 나오면 while문 종료
			if (num==6) {
				break;
			}
		}
		System.out.println("프로그램 종료");

	}

}
