package control.loop;

/**
 * 중첩 for loop 를 사용하여 구구단을 출력
 * 2 ~ 9단 출력
 *
 * 각 단을 시작할 때 단의 제목 출력
 * @author Administrator
 *
 *
 */
public class NineNineTable {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화, 3. 사용
		
		// 외부 for loop : 단을 결정
		for (int stage = 2; stage <= 9; stage += 3) {
			
			System.out.printf("%n%d단\t\t%d단\t\t", stage, stage +1);
			if (stage < 8) {
				
				System.out.printf("%d단", stage + 2);
			}
			System.out.println();
			
			// 내부 for loop : 1 ~ 9 까지 곱해지는 수를 반복
			for (int times = 1; times <= 9; times++) {
				System.out.printf("%d x %d = %2d\t%d x %d = %2d\t", stage, times, (stage * times)
																  , stage + 1, times, (stage +1) * times);
				if (stage < 8) {
					System.out.printf("%d x %d = %2d", stage + 2, times, (stage +2) * times);
				}
				System.out.println();
			} // end inner for
		} // end outer for

	} // end main

} // end class
