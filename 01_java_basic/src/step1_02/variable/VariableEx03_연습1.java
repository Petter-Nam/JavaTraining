package step1_02.variable;

public class VariableEx03_연습1 {

	public static void main(String[] args) {
		
		//예) 현금이 10000원있다. 2800원짜리 과자 구입 후, 잔돈 출력
		
		int cash = 10000;
		int snack = 2800;
		int change = cash - snack;
		System.out.println("잔돈 = " + change + "원");
		
		//문제1) 프리랜서의 세율은 3.3%이다. 월급이 2000000원일때 세금을 출력
		int salary = 2000000;
		double tax = 0.033;
		System.out.println("당신의 세금은 " + (salary*tax) + "입니다.");
		
		//문제2) 시험점수를 100, 88, 92점 을 받았다. 평균은?
		int test1 = 100;
		int test2 = 88;
		int test3 = 92;
		int testSum = test1 + test2 + test3;
		System.out.println(testSum / 3);
		
		//문제3) 밑변이 3이고 높이가 7인 삼각형 넓이 출력 (삼각형의 넓이 구하는 공식 : 밑변 * 높이 / 2)
		int base = 3;
		int height = 7;
		int triangleArea = (base * height)/2;
		System.out.println("삼각형의 넓이는 :" + triangleArea);
		
		//문제4) 100초를 1분 40초로 출력
		int totalSec = 100;
		int minute = totalSec / 60;
		int sec = totalSec % 60;
		System.out.println(minute + "분" + sec + "초 입니다.");
		
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		//정답5) 500원의 개수 = 1개
		//       100원의 개수 = 3개 
		int eightHundred = 800;
		int fiveHundredCount = eightHundred / 500;
		int oneHundredCount = (eightHundred % 500) / 100;
		System.out.println("500원의 갯수는 :" + fiveHundredCount + "개 입니다. " + "100원의 개수는 " + oneHundredCount + "입니다.");

	}

}
