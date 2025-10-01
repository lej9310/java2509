package ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		// 5.4. null과 NullPointerException
		String hobby = "여행";
		hobby = null; // "여행"에 해당하는 String 객체를 쓰레기로 만듦

		String kind1 = "자동차";
		// kind1 변수에 저장되어 있는 번지를 kind2 변수에 대입
		String kind2 = "kind1";
		// "자동차"에 해당하는 String 객체는 kind2가 참조하고 있기 때문에 쓰레기가 아님
		kind1 = null;
		
		System.out.println("kind2 " + kind2);

	}

}
