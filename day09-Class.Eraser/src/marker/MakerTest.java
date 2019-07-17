package marker;

public class MakerTest {

	public static void main(String[] args) {
		// 1. 선언
		Marker myMarker;
		Marker red;
		Marker blue;
		Marker green;
		Marker black;
		
		// 2. 초기화
		myMarker = new Marker();
		red = new Marker("빨강", true, true);
		blue = new Marker("파랑", false, false);
		green = new Marker("녹색", true, false);
		black = new Marker("검정", true, false);
		
		// 3. 출력
		myMarker.print();
		red.print(); 
		blue.print(); 
		green.print();
		black.print();
		
		// 4. 색 입력후 초기화
		myMarker = new Marker("검은색");
		
		// 5. 출력
		myMarker.print();
		
		// 6. isNew 초기화
		myMarker = new Marker("검은색", true);
		
		// 7. 출력
		myMarker.print();
		
		// 8. 매개변수 3개 초기화
		myMarker = new Marker("검은색", true, true);
		
		// 9. 출력
		myMarker.print();
		
	}

}
