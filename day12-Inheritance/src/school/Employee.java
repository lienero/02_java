package school;

public class Employee extends Person {
	// 1. 멤버변수
	private String dept;
	
	// 2. 생성자 중복정의
	Employee(String id, String name, int age) {
		super(id, name, age);
	}
	
	Employee(String id, String name, int age, String dept) {
		super(id, name, age);
		this.dept = dept;
	}
	
	// 3. 접근자 / 수정자
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	// 4. toSting() 재정의
	@Override
	public String toString() {
		return super.toString() + dept;
	}

	

}
