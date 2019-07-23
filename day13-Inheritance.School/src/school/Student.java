package school;

public class Student extends Person {
	// 1. 멤버변수
	private String major;
	
	// 2. 생성자 중복정의
	public Student(String id, String name, int age) {
		super(id, name, age);
	}
	
	public Student(String id, String name, int age, String major) {
		this(id, name, age);
		this.major = major;
	}
	
	// 3. 접근자 / 수정자
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	// 4. toSting() 재정의
	@Override
	public String toString() {
		return super.toString() + major;
	}

}
