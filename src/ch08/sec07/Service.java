package ch08.sec07;

//예제. Service 인터페이스에서 2개의 "default 메소드"와 2개의 "정적 메소드" 중
// 중복 코드 부분 => 각각 "private 메소드"와 "private 정적 메소드"로 선언하고 호출

public interface Service {	

	// 디폴트 메소드 =================================
	default void defaultMethod1() {
		System.out.println("defaulMethod1 종속 코드");
		defaultCommon();
	}

	default void defaultMethod2() {
		System.out.println("defaulMethod2 종속 코드");
		defaultCommon();
	}

	// private 메소드 >> 구현 객체 필요 =================================
	// >> default 메소드 안에서만 호출이 가능
	private void defaultCommon() {
		System.out.println("defaulMethod 중복 코드A");
		System.out.println("defaulMethod 중복 코드B");
	}

	// 정적 메소드 =================================
	static void staticMethod1() {
		System.out.println("staticMethod1 종속 코드");
		staticCommon();
	}

	static void staticMethod2() {
		System.out.println("staticMethod2 종속 코드");
		staticCommon();
	}

	// private 정적 메소드 >> 구현 객체 필요 없음 ===========================
	// >> default 메소드 + 정적 메소드 안에서도 호출 가능
	private static void staticCommon() {
		System.out.println("staticMethod 중복 코드C");
		System.out.println("staticMethod 중복 코드D");
	}

}
