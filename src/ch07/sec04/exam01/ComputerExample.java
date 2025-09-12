package ch07.sec04.exam01;

public class ComputerExample {

	public static void main(String[] args) {
		// 7.4. 메소드 재정의 (메소드 오버라이딩)

		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원 면적: "+ calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println(" 원 면적: " + computer.areaCircle(r));
	}

}
