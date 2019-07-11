package array.multi;

import java.util.Scanner;

public class BestPitcher {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		Scanner scan = new Scanner(System.in);
		double[][] era = new double[3][5];
		double min = 10.0;
		
		// 각 팀별로 각 투수의 방어율 입력받아 배열에 저장한다.
		System.out.println("1선발 2선발 3선발 4선발 5선발 방어율 입력");
		for (int idx = 0; idx < era.length; idx++) {
			System.out.println((idx + 1) + "번째 팀 1~5선발 투수 방어율:");
			for (int ind = 0; ind < era[idx].length; ind ++) {
				era[idx][ind] = scan.nextInt();
				if(era[idx][ind] < min) {
					min = era[idx][ind];
				}
			}
		}
		System.out.println("최고의 투수는?");
		for (int idx = 0; idx < era.length; idx++) {
			for (int ind = 0; ind < era[idx].length; ind ++) {
				if (era[idx][ind] == min) {
					System.out.printf("최고의 투수는 방어율 %5.1f의 %d 번째 팀 %d선발입니다."
									   , min, idx+1, ind+1);
				}
			}
			
		}
	}

}
