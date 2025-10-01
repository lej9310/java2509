package ch04.sec03;

public class SwitchExample {

	public static void main(String[] args) {
		// Switch문: 변수값에 따라 실행문 결정. if-else문은 조건식 추가로 코드 복잡

		// 1~6 랜덤번호
		int num = (int) (Math.random() * 6) + 1;

		switch (num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
			// default 필요 없다면 생략 가능
		default:
			System.out.println("6번이 나왔습니다.");

		}

	}

}
