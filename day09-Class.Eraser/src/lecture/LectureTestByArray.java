package lecture;

/**
 * 2개의 지우개와 4개의 마커를 
 * 배열을 사용하여 사용/관리 하는 테스트 클래스
 * --------------------------------------------
 * 1. 마커(Marker) 배열 markers 를 선언
 *    지우개(Eraser) 배열 erasers 를 선언
 *    
 * 2. markers 는 길이 4로 생성
 *    eraser 는 길이 2로 생성
 *  
 *  markers[0] <== 에는 순서대로 
 *  ~ 
 *  markers[3] red, green, blue, black 마커를 저장 
 *  
 *  erasers[0], [1] 에는 순서대로
 *            leftEraser, rightEraser 를 저장
 *            
 * 3. foreach 를 사용하여
 *   (1) 모든 마커를 한번씩 사용(use())
 *   (2) 모든 지우개를 한번씩 사용(erase())
 *   (3) 모든 지우개를 한번씩 한 겹 벗겨내기(peel())
 *   (4) 모든 지우개의 상태 출력
 *   (5) 모든 마커의 상태 출력          
 *  
 * @author 304
 *
 */
public class LectureTestByArray {

	public static void main(String[] args) {
		// 1. 선언
		Marker[] markers;
		Eraser[] erasers;
		
		// 2. 초기화
		markers = new Marker[4];
		erasers = new Eraser[2];
		
		// markers[3] red, green, blue, black 마커를 저장
		markers[0] = new Marker("빨강", true, true);
		markers[1] = new Marker("파랑", false, false);
		markers[2] = new Marker("녹색", true, false);
		markers[3] = new Marker("검정", true, false);
		
		// erasers[0], [1] 에는 순서대로 leftEraser, rightrEraser 를 저장
		erasers[0] = new Eraser(3.5, 12.0, 5.5, 3, "검정색", "왼쪽");
		erasers[1] = new Eraser(3.5, 12.0, 5.5, 3, "흰색", "오른쪽");
		
		// 3. foreach 를 사용하여
		// (1) 마커를 한 번씩 사용(use())
		for(Marker mk : markers) {
			mk.used();
		}
		
		// (2) 모든 지우개를 한번씩 사용(erase())
		for(Eraser ers : erasers) {
			ers.erase();
		}
		
		// (3) 모든 지우개를 한번씩 한 겹 벗겨내기(peel())
		for(Eraser ers : erasers) {
			ers.peel();
		}
		
		// (4) 모든 지우개의 상태 출력
		for(Eraser ers : erasers) {
			ers.print();
		}
		
		// (5) 모든 마커의 상태 출력
		for(Marker mk : markers) {
			mk.print();
		}
	}

}
