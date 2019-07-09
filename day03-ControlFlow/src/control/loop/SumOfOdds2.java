package control.loop;

/**
 * while 문을 이용하여 1 ~ 100사이의 짝수의 합을 구하는 클래스
 * @author Administrator
 *
 */
public class SumOfOdds2 {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		int num = 2;
		int sum = 0;
		
		// while 반복문
		while (num <= 100) {
			sum += num;
			num += 2;
		}

		System.out.printf("1부터 100사이 짝수의 합은 %d입니다.%n" ,sum);
	
	}

}
