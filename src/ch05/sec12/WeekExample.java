package ch05.sec12;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		// 5.12. 열거(Enum) 타입: 한정된 값을 갖는 타입
		// 먼저 열거 타입 이름으로 소스 파일을 생성하고 한정된 값을 코드로 정의
		// 열거 타입 이름은 첫 문자를 대문자로

		// Week 열거 타입 변수 선언
		Week today = null;

		// Calendar 얻기
		// 컴퓨터 날짜 및 시간 정보를 가진 Calendar 객체를 얻고 번지를 cal 변수에 대입
		Calendar cal = Calendar.getInstance();

		// 오늘의 요일 얻기(1~7값)
		int week = cal.get(Calendar.DAY_OF_WEEK);

		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNSDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}

		// 열거 타입 변수를 사용
		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바를 공부합니다.");
		}
	}

}
