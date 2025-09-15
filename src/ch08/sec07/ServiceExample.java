package ch08.sec07;

public class ServiceExample {

	public static void main(String[] args) {
		// 8.7. private 메소드
		// 인터페이스 - 상수 필드, 추상/디폴트/정적 메소드 => public 접근 제한자
		// 인터페이스 - private 메소드 >> 외부에서 접근할 수 없음 
		
		
		// 인터페이스 변수 선언과 구현 객체 대입
		Service service = new ServiceImpl();
		
		// 디폴트 메소드 호출
		service.defaultMethod1();
		System.out.println();
		service.defaultMethod2();
		System.out.println("======================\n");
		
		// 정적 메소드 호출
		Service.staticMethod1();
		System.out.println();
		Service.staticMethod2();
		System.out.println();

	}

}
