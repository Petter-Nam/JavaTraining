package step1_03.operator;

import java.util.Arrays;
import java.util.Scanner;

// 2024-01-16  13:31 ~ 
/*
 * 
 * */

public class OperatorEx03_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//예) 현금이 10000원있다. 2800원짜리 과자 구입 후, 잔돈 출력 
		System.out.println(10000 - 2800);
		System.out.println("잔돈 = " + (10000 - 2800) + "원");
		
		//문제1) 프리랜서의 세율은 3.3%이다. 월급이 2000000원일때 세금을 출력
		int salary = 2000000;
		double tax = 0.033;
		double caculate = salary * tax;
		System.out.println("월급 : " + salary + " 세율 : " + tax +  " 세금 : " + caculate);
		
		//문제2) 시험점수를 100, 88, 92점 을 받았다. 평균은?
		
		
		//문제3) 밑변이 3이고 높이가 7인 삼각형 넓이 출력 (삼각형의 넓이 구하는 공식 : 밑변 * 높이 / 2)
		
		
		//문제4) 100초를 1분 40초로 출력
		
		
		//문제5) 800원에서 500원짜리 개수와 100원짜리 개수 출력
		//정답5) 500원 = 1개 
		//		100원 = 3개 

	}

}
