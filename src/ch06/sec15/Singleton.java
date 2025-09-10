package ch06.sec15;

public class Singleton {

	// 싱클톤 패턴 : 생성자를 private 접근 제한해 외부에서 new 연산자로 생성자 호출 막음
	// 애플리케이션 전체에서 단 한 개의 객체만 생성해서 사용하고 싶을 때

	// 1번. private 접근 권한을 갖는 정적 필드 선언과 초기화
	// 자신의 타입으로 정적 필드를 선언하고 미리 객체를 생성해서 초기화 시킴
	// private 접근 제한자를 붙여 외부에서 정적 필드값을 변경하지 못하도록 막음
	private static Singleton singleton = new Singleton();

	// 2번. public 접근 권한을 갖는 정적 메소드 선언
	// 정적 필드값을 리턴하는 getInstance() 정적 메소드를 public으로 선언
	public static Singleton getInstance() {
		return singleton;
	}

}
