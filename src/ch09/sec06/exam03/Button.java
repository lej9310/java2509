package ch09.sec06.exam03;

public class Button {

	// 9.6. 중첩 인터페이스: 클래스의 멤보로 선언된 인터페이스 >> 이벤트 처리 목적 사용
	// 인터페이스를 클래스 내부에서 선언 이유 >> 해당 클래스와 긴밀한 관계를 맺는 구현 객체 생성

	// 정적 중첩 인터페이스
	// 암시적으로 static >> 항상 A 객체 없이 B 인터페이스를 사용 가능
	public static interface ClickListener {
		// 추상 메소드
		void onClick();
	}
	
	// 중첩 인터페이스 타입으로 필드와 Setter 선언 >> 외부에서 Setter를 통해 Listener 구현 객체를 필드에 저장 

	// 필드
	private ClickListner clickListener;

	// 메소드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	// Button이 클릭되었을 때 실행하는 메소드 선언
	public void click() {
		this.clickListener.onClick();
	}

}
