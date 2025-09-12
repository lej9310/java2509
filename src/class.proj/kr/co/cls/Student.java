package kr.co.cls;

public class Student {

	// 필드 생성 =====================================
	private String name;
	int age;
	private String studentId;

	// 메소드 생성 =====================================
	void introduce() {
		System.out.println(this.name + "를 소개합니다.");
	}

	void study() {
		System.out.println(this.studentId + "번이 공부합니다.");
	}

	// Constructor 생성 ====================================
	// 전체 필드를 사용자에게 입력받는 경우
	public Student(String name, int age, String studentId) {
		this.name = name;
		this.age = age;
		this.studentId = studentId;
		System.out.println("name: " + this.name + ", age: " + this.age + ", studentId: " + this.studentId);
	}

	// 필수 입력 필드를 사용자에게 입력받는 경우
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
		System.out.println("name: " + this.name + ", studentId: " + this.studentId);
	}

	// 마우스 우클릭- Source - Generate toString()
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + "]";
	}

	// 예제3. Generate getters and setters ==========================
	// name & studentId
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

}
