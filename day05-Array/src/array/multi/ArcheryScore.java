package array.multi;

import java.util.Scanner;

public class ArcheryScore {

	public static void main(String[] args) {
		// 1. 선언, 2.초기화
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[3][9];
		int[] sum = new int[3];
		int total;
		int max = 0;
		
		// 각 선수별로 과녁 점수를 입력받아 배열에 저장
		System.out.println("양궁 선수 점수 입력");
		for (int idx = 0; idx < score.length; idx++) {
			System.out.println((idx + 1) + "번째 선수 점수 입력(1~10):");
			for (int ind = 0; ind < score[idx].length; ind ++) {
				score[idx][ind] = scan.nextInt();
				sum[idx] += score[idx][ind]; 
				if( sum[idx] > max) {
					max = sum[idx];
					
				}
			}
		}
		System.out.println("우승선수");
		for (int idx = 0; idx < score.length; idx++) {
			for (int ind = 0; ind < score[idx].length; ind ++) {
				if (sum[idx] == max) {
					System.out.printf("우승선수는 총합 %2d로 %d 번째 선수입니다."
									   , max, idx+1);
				}
			}
			
		}

	}

}
