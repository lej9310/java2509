package ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable {

	// 8.8. 다중 인터페이스 구현
	// RemoteControl과 Searchable 인터페이스를 모두 구현하는 클래스 작성

	// 오버라이딩==================
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	public void turnOff() {
		System.out.println("tv를 끕니다.");
	}

	public void search(String url) {
		System.out.println(url + "을 검색합니다.");

	}
}
