package control.loop;

/**
 * 1. 50 ~ 0 까지 짝수만 역순으로 출력
 *   (1) continue 없이
 *   (2) continue 사용
 *  
 * -----------------------------------------  
 * 2. 1 ~ 10 까지 제곱표를 출력
 *    1 x 1   =   1
 *    2 x 2   =   4
 *    ...
 *    10 x 10 = 100
 * ---------------------------------------------   
 *    
 * @author Administrator
 *
 */
public class ForTest {

	public static void main(String[] args) {
		// 1. 선언, 초기화, 사용
		int sum = 0;
		
		System.out.printf("%n50 ~ 0 까지 짝수만 역순으로 출력%n");
		for(int even = 50; even >= 0; even--) {
			if (even % 2 != 0) {
				;
			} else {
			System.out.printf("%2d%n", even);
			}
		}
		
		// continue 사용
		System.out.printf("%n50 ~ 0 까지 짝수만 역순으로 출력(continue)%n");
		for(int even = 50; even >= 0; even--) {
			if (even % 2 != 0) {
				continue;
			}
			System.out.printf("%2d%n", even);
		}
		
		// 2. 제곱표 출력
		System.out.printf("%n1 ~ 10 까지 제곱표를 출력%n");
		for(int bin = 1; bin <= 10; bin ++ ) {
			System.out.printf("%2d x %2d = %3d%n", bin, bin, (bin * bin));
		}
		
		// 3. 제곱표 출력(배열, foreach 사용)
		System.out.printf("%n1 ~ 10 까지 배열을 이용한 제곱표를 출력%n");
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int num : numbers) {
			System.out.printf("%2d x %2d = %3d%n", num, num, num * num);
		}

	}

}
