package kr.co;

import kr.co.poly.PolyClass;
import kr.co.abstr.AbstrClass;
import kr.co.ext.ExtClass;
import kr.co.inter.InterfClass;
import kr.co.inter.InterfClass;

public class MyMain {

	public static void main(String[] args) {

		// 예제. 상속 (기능 확장) =============================

		// [데이터타입] [변수이름] = [값]
		
		// 생성자 선언
		//ExtClass extClass = new ExtClass();		

		// TEST 1.
		// Primitive 원시 자료형 >> java에 내장된 자료형
		// >> 정수형(byte < short < int < long), 부동소숫점(float < double), 참거짓(boolean),
		// 단일문자(char)
		// int num = 10;

		// TEST 2. Non-primitive, Reference types 참조형 >> 개발자가 직접 생성하는 자료형
		// >> 문자열(String), 배열(Array), 클래스(Class)
		// String str = "test";
		

		// 예제2. 다형성 =============================
		// PolyClass polyClass = new PolyClass();
		
		
		// 예제3. 추상클래스 =================================
		// AbstrClass abstrClass = new AbstrClass(); 
		
		// 예제 4. 인터페이스 ===============================
		InterfClass interfClass = new InterfClass(); 

	}

}
