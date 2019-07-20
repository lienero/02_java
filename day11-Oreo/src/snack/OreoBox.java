package snack;

/**
 * 오레오(Oreo) 쿠키가 
 * 여러개 들어가있는 박스
 * @author Administrator
 *
 */
public class OreoBox {

	// TODO Oreo 를 여러개 저장할 수 있는
	// Oreo[] oreos 를 멤버 변수로 갖도록 선언
	Oreo[] oreos;
	
	// TODO 생성자 기본, 매개변수 중복정의
	OreoBox() {
		oreos = new Oreo[0];
	}
	
	OreoBox(Oreo[] oreos) {
		this.oreos = oreos;
	}
	
	// TODO 오레오 박스에
	// 오레오 쿠키를 1개씩 추가, 삭제, 수정, 꺼내(get)거나 
	// 오레오 추가
	public void add(Oreo oreo) {
		Oreo[] newOreos;
		newOreos = new Oreo[oreos.length + 1];
		
		for (int idx = 0; idx < oreos.length; idx++) {
			newOreos[idx] = oreos[idx];
		}
		
		newOreos[newOreos.length - 1] = oreo;
		
		this.oreos = newOreos;
	}
	
	// 오레오 삭제
	public void remove(Oreo oreo) {
	
		Oreo[] newOreos;
	
		// 1. 폐기할 오레위 위치 찾기
		int index = findOreoIndex(oreo);
	
		// 삭제로직 조건1
		if (index > -1) {
	
			// 2. 폐기 안할 책을 유지할 새 배열(-1) 생성
			newOreos = new Oreo[oreos.length - 1];

			// 3. 폐기할 인덱스가 배열 중간일 때
			if (index < oreos.length - 1 ) {
				for (int idx = 0; idx < index; idx++) {
					newOreos[idx] = oreos[idx];
				}
			
				for (int idx = index; idx < newOreos.length; idx++) {
					newOreos[idx] = oreos[idx + 1];
				}
			} else {
				// 4. 폐기할 인덱스가 마지막(index == oreos.length)  
				//	  폐기할 인덱스 인덱스 앞쪽까지만 새 배열에 복사
				for (int idx = 0; idx < oreos.length - 1; idx++ ) {
					newOreos[idx] = oreos[idx];
				}
			}
			// 6. 남는 책이 복사된 새 배열을
			// 	  this.book 에 새로 저장
			this.oreos = newOreos;
		}
	}
	
	// 오레오 수정
	public void set(Oreo oreo) {
		int index = findOreoIndex(oreo);
		
		if (index > -1) {
			oreos[index] = oreo;
		}
	}
	
	// 오레오 꺼내기
	public Oreo get(Oreo oreo) {
		return findOreo(oreo);
	}
	
	public Oreo[] getAllOreos() {
		return this.oreos;
	}
	
	//oreo의 seq를 찾는 메소드
	private int findOreoIndex(Oreo oreo) {
		int index = -1;
		for (int idx = 0; idx < oreos.length; idx++) {
			if (oreos[idx].getSeq() == oreo.getSeq()) {
				// 같은 책 찾았다.
				index = idx;
				break;
			}
		}
		
		return index;
	}
	
	// oreo를 찾는 리턴 메소드
	Oreo findOreo(Oreo oreo) {
		Oreo findOreo = null;
		for (int idx = 0; idx < oreos.length; idx++) {
			if (oreos[idx].getSeq() == oreo.getSeq()) {
				// 같은 책 찾았다.
				findOreo = oreos[idx];
				break;
			}
		}
		
		return findOreo;
	}
}
