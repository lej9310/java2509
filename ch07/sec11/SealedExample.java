package ch07.sec11;

public class SealedExample {

	public static void main(String[] args) {
		Person p = new Person();
		Employee e = new Employee();
		Manager m = new Manager();
		Director d = new Director();

		p.work(); // 부모 클래스  
		e.work(); // 부모 클래스 >> permits Employee
		m.work(); // 부모 클래스 >> permits Manager
		d.work(); // 

	}

}
