package snack;
/**
 * Oreo 쿠키를 정의하는 클래스
 * --------------------------
 * 속성 :
 * cream 	 : String : 바닐라, 초코, 딸기, 말차
 * radius 	 : double : 오레오 쿠키 1개의 반지름 길이
 * thickness : double : 오레오 쿠키 1개의 두께
 * --------------------------------------------
 * 생성자 : 기본생성자, 중복정의 this, this() 로 정의하는 생성자
 * 총 4개의 생성자 중복정의
 *  -------------------------------------------------
 * 메소드 :
 * print() : void : 오레오 쿠키의 상태출력
 * changeCream(String cream) : void 
 * 			: 매개변수로 입력된 cream 값으로
 * 			  오레오 쿠키의 크림을 변경함
 * 
 * @author Administrator
 *
 */

public class Oreo {
	// 1. 멤버 변수 선언
	// TODO 쿠키 일려번호 int seq; 추가
	String cream;
	double radius;
	double thickness;
	int	seq;
	
	// 2. 생성자 중복 정의
	Oreo() {
		
	}
	
	// TODO 생성자 seq 필드에 대해 중복정의
	Oreo(int seq) {
		this();
		this.seq = seq;
	}
	
	Oreo(int seq, String cream) {
		this(seq);
		this.cream = cream;
	}
	
	Oreo(int seq, String cream, double radius) {
		this(seq, cream);
		this.radius = radius;
	}
	
	Oreo(int seq, String cream, double radius, double thickness) {
		this(seq, cream, radius);
		this.thickness = thickness;
	}
	
	// 3. 메소드 정의
	public void print() {
		System.out.printf("seq : %d, cream : %s, radius : %5.2f, thickness : %5.2f%n", seq, cream, radius, thickness);
	}
	
	public void changeCream(String cream) {
		this.cream = cream;
	}
	
	// TODO 접근자, 수정자
	// 접근자
	public int getSeq() {
		return seq;
	}
	
	public String getCream() {
		return cream;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getThickness() {
		return thickness;
	}
	
	// 수정자
	public void setSeq(int seq) {
		this.seq = seq;
	}
	
	public void setCream(String cream) {
		this.cream = cream;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setThickness(double thickness) {
		this.thickness = thickness;
	}
	
}
