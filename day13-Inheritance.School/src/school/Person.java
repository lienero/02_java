package school;

/**
 * 시스템에 저장될 학생, 선생, 직원의 정보중
 * 공통적인 내용을 추출할 상위클래스
 * 일반적인 사람의 정보를 저장한다.
 * ----------------------------------
 * id 	: String
 * name : String
 * age  : int
 * 
 * --------------------------------------------------
 * @author Administrator
 *
 */

public abstract class Person {
	// 1. 멤버변수
	private String id;
	private String name;
	private int age;
	
	// 2. 생성자
	// (1) 기본생성자 명시 : 생성자 선언부를 완정히 생략하면
	//  					 자동으로 기본생성자 선언이 들어가짐.
	//						 그러나 기본생성자가 아닌 생성자를
	//						 하나라도 선언하면 자동생성되지 않음
	public Person() {
		
	}
	
	// (2) 매개변수를 받는 생성자
	//     매개변수를 받는 생성자가 선언이 된 상태에서
	//	   기본생성자 선언을 누락하는 경우
	//	   기본생성자는 자동으로 만들어지지 않음 주의
	
	/**
	 * id 필드만 초기화하는 생성자
	 * @param id
	 */
	public Person(String id) {
		this();
		this.id = id;
	}
	
	/**
	 * id, name 필드만 초기화하는 생성자
	 * @param id
	 * @param name
	 */
	public Person(String id, String name) {
		this(id);
		this.name = name;
	}
	
	/**
	 * 전체필드를 초기화하는 생성자
	 * @param id
	 * @param name
	 * @param age
	 */
	public Person(String id, String name, int age) {
		this(id, name);
		this.age = age;	 
	}
	
	// 3. 접근자 / 수정자
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// 4. 메소드 선언
	// toString() 재정의
	// String == char[]
	/**
	 * toString() 메소드의 특별함 
	 * -----------------------------------------
	 * 1. pring 계열의 메소드에서 !!객체참조변수!!를 출력할 때
	 *    자동으로 작동하는 메소드
	 * 2. Object 클래스에서 상속받은 메소드
	 * 3. 객체를 대표하는 문자열을 만들어서 리턴한다. 
	 *    => 각 필드를 모두 출력하는 문자열
	 */
	@Override 
	public String toString() {
		return String.format("id : %s, name : %s, age %d", id, name, age);
	}
	
	// (2) print()
	/**
	 * 현재의 객체를 출력하는 메소드
	 */
	public void print() {
		System.out.println(this);
	}

}
