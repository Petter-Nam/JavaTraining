package step1_05.condition;

import java.util.Scanner;

/*
 * 이전 문제를 풀다보니 매우 쉽다.
 */

/*
 * # 구구단 게임[1단계]
 * 
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */


public class IfEx06_연습1 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);	
		
		System.out.print("구구단 문제를 출력하는 것입니다.");
		System.out.println();
		
		System.out.print("첫번째 숫자를 입력해주세요");
		int gugudan1 = scan.nextInt();
		
		System.out.print("두번째 숫자를 입력해주세요");
		int gugudan2 = scan.nextInt();
		
		int result = gugudan1 * gugudan2;
		
		System.out.println("정답을 맞추어보세요");
		int whatIsResult = scan.nextInt();
		
		if (result == whatIsResult) System.out.println("정답");
		if (result != whatIsResult) System.out.println("");
		
		scan.close();

	}

}
