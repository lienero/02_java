package lecture;

/**
 * 마커(Marker)와 칠판지우개(Eraser) 를 사용하여
 * 마커를 쓰고
 * 지우개로 지워보는 테스트 클래스
 * 
 * 
 * @author Administrator
 *
 */
public class LectureTest {

	public static void main(String[] args) {
		// 1. 선언 : 지우개 2개, 마커 4개
		Eraser rightEraser;
		Eraser leftEraser; 
		
		Marker red;
		Marker blue;
		Marker green;
		Marker black;
		
		// 2. 초기화
		leftEraser = new Eraser(3.5, 12.0, 5.5, 3, "검정색", "왼쪽");
		rightEraser = new Eraser(3.5, 12.0, 5.5, 3, "흰색", "오른쪽");
		
		red = new Marker("빨강", true, true);
		blue = new Marker("파랑", false, false);
		green = new Marker("녹색", true, false);
		black = new Marker("검정", true, false);
		
		// 3. 사용
		// (1) 네 개의 마커를 한번씩 사용
		red.used();
		blue.used();
		green.used();
		black.used();
		
		// (2) 오른쪽, 왼쪽 지우개로 사용한 내용 지우기
		rightEraser.erase();
		leftEraser.erase();
		
		// (3) 오른쪽 지우개 한 겹 벗겨내기
		rightEraser.peel();
		
		// (4) 오른쪽,왼쪽 지우개 상태 출력
		rightEraser.print();
		leftEraser.print();

	}

}
