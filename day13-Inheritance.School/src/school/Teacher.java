package school;

public class Teacher extends Person {
	// 1. 멤버변수
	private String subject;
	
	// 2. 생성자 중복정의
	Teacher(String id, String name, int age) {
		super(id, name, age);
	}
	
	Teacher(String id, String name, int age, String subject) {
		super(id, name, age);
		this.subject = subject;
	}
	
	// 3. 접근자 / 수정자
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	// 4. toSting() 재정의
	@Override
	public String toString() {
		return super.toString() + subject;
	}

	

}
