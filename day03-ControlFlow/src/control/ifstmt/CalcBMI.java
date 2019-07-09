package control.ifstmt;

import java.util.Scanner;

public class CalcBMI {

	public static void main(String[] args) {
		// 1. 선언
		double weight;
		double height;
		double bmi;
		String jud;
		
		Scanner scan;
		
		// 2. 초기화
		scan = new Scanner(System.in);
		
		System.out.println("몸무게를 입력해주세요.");
		weight = scan.nextDouble();
		
		System.out.println("키를 입력해주세요.");
		height = scan.nextDouble();
		
		bmi = weight / ((height / 100) * (height / 100));
		
		// 3. if 문 작성
		if (bmi < 15) {
			jud = "병적인 저체중";
		} else if (bmi >= 15   && bmi < 18.5) {
			jud = "저체중";
		} else if (bmi >= 18.5 && bmi < 23) {
			jud = "정상";
		} else if (bmi >= 23   && bmi <= 27.5) {
			jud = "과체중";
		} else if (bmi > 27.5  && bmi <= 40) {
			jud = "비만";
		} else {
			jud = "병적인 비만";
		} // else end
		
		System.out.printf("고객님의 BMI는 %f로 %s 입니다.", bmi, jud);
	}

}
