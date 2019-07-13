package practice.methods;

public class VarietyMethodsTest {

	public static void main(String[] args) {
		// 1. 선언
		VarietyMethods myvarietyMethods;
		
		// 2. 초기화
		myvarietyMethods = new VarietyMethods();
		
		
		// 3. 사용
		System.out.println("생년월일");
		myvarietyMethods.birthYearMonth("이경민", 19994, 06);
		
		
		System.out.println();
		System.out.println("구구단");
		myvarietyMethods.printNineNineTable(2);
		
		
		System.out.println();
		System.out.println("배열 구구단");
		int[] array = {2, 3, 4};
		myvarietyMethods.printNineNineTableArray(array);
		
		
		System.out.println();
		System.out.println("비만도 판정 결과");
		String bmi = myvarietyMethods.calcBmi(69, 177);
		System.out.printf("%s%n", bmi);
		
		
		System.out.println();
		System.out.println("작은 수 찾기");
		int result = myvarietyMethods.min(10, 20);
		System.out.printf("%d%n", result);
		
		
		System.out.println();
		System.out.println("큰 수 찾기");
		System.out.printf("%d%n", result);
		
		
		System.out.println();
		System.out.println("배열의 각 원소의 합");
		int sumarray = myvarietyMethods.sumOfArray(array);
		System.out.printf("%d%n", sumarray);
		
		
		System.out.println();
		System.out.println("배열의 평균");
		int avgarray = myvarietyMethods.avgOfArray(array);
		System.out.printf("%d%n", avgarray);
		
		
		System.out.println();
		System.out.println("덧셈");
		myvarietyMethods.adder('+', 10, 20);


	}

}
