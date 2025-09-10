package ch06.sec11.exam2;

public class Earth {
	// 상수 선언 >> 불변의 값 >> static + final
	// 객체마자 저장할 필요 없고, 여러 개의 값을 가져도 안됨

	// 상수 선언 및 초기화 >> static final 타입 상수 [=초기값];
	static final double EARTH_RADIUS = 6400;

	// 상수 선언
	static final double EARTH_SURFACE_AREA;

	// 정적 블록에서 상수 초기화
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}

}
