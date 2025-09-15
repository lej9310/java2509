package ch08.sec13;

// 8.13. 봉인된 인터페이스
// 무분별한 자식 인터페이스 생성을 방지하기 위해 sealed 인터페이스 사용

// InterfaceA의 자식 인터페이스는 InterfaceB만 가능
public sealed interface InterfaceA permits InterfaceB {
	void methodA();
}
