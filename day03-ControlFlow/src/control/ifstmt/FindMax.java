package control.ifstmt;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		int x;
		int y;
		int max = 0;
		
		Scanner scan;
		
		scan = new Scanner(System.in);
		
		System.out.println("두 정수를 입력(space bar 로 분리)");
		
		x = scan.nextInt();
		y = scan.nextInt();
		
		if(x > y) {
			max = x;
			System.out.printf("입력된 두 값 x=%d, y=%d 중 큰 값은 %d%n", x, y, max);
		}
	
		if(y > x) {
			max = y;
			System.out.printf("입력된 두 값 x=%d, y=%d 중 큰 값은 %d%n", x, y, max);
		}
		if(x == y)
			System.out.println("입력된 두 수의 값이 같습니다.");
			
	}

}
