package array.basic;

/**
 * 1. 1 ~ 10 까지의 정수를
 *    원소로 가지는 배열 numbers 를 선언
 * 
 * 2. for (index 사용하는 전통적인 for) 구문을 사용하여
 *    1 ~ 10까지 정수를 저장한다.
 *
 * 3. foreach 구문을 사용하여
 * 	  1에서 저장된 값의 제곱표를 출력한다.
 * @author Administrator
 *
 *
 */
public class SquareTable {

	public static void main(String[] args) {
		// 1. 선언
		int[] numbers = new int[10];
		
		// 2. 정수 저장
		for(int idx = 0; idx < numbers.length; idx++) {
			numbers[idx] = (idx + 1);
			System.out.printf("numbers[%d] = %d%n", idx, numbers[idx]);
		}
		
		// 3. 제곱표 출력
		System.out.println("제곱표 출력");
		for (int num : numbers ) {
			System.out.printf("%2d x %2d = %3d%n", num, num, num * num);
			
		}

		
	}

}
