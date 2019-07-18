package marker;

public class Marker {
	static int count = 0;
	
	//1. 멤버 변수 선언
	int serial;
	/** 새 마커인지 여부
	 * true : 뚜껑이 열려있는 상태
	 * false : 뚜껑이 닫혀있는 상태 */
	boolean isNew;
	/** 마커의 뚜껑이 열려있는지 여부 */
	boolean isOpend;
	/** 마커의 색상 */
	String color;

	Marker() {
	this.serial = ++count;	
	}
	
	Marker(String color) {
		this();
		this.color = color;
	}
	
	Marker(String color, boolean isNew) {
		this(color);
		this.isNew = isNew;
	}
	
	Marker(String color, boolean isNew, boolean isOpend) {
		this(color, isNew);
		this.isOpend = isOpend;
	}
	
	// 3. 메소드 선언부
	/**
	 * ~ 색의 마커를 사용하고 있습니다.
	 * 라는 문장을 출력하는 메소드
	 */
	public void used() {
		System.out.printf("%s 마커를 사용하고 있습니다%n", color);
	}

	
	public void print() {
		String printNew;
		if (isNew) {
			printNew = "새 마커입니다.";
		} else {
			printNew = "다 쓴 마커입니다.";
		}
		
		String pirntOpend;
		if (isOpend) {
			pirntOpend = "마커 뚜껑이 열려있습니다.";
		} else {
			pirntOpend = "마커 뚜껑이 닫혀있습니다.";
		}
		System.out.printf("serial : %d, color : %s, isNew : %s, isOpend : %s%n", serial , color, printNew, pirntOpend);
	}
	
	
	

}
