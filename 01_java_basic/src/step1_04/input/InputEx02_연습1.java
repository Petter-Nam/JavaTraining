package step1_04.input;

import java.util.Scanner;
/*/
 * 
 * new와 scanner의 의미는 모르지만 문법의 규칙을 외우는게 더 중요할 듯 싶다.
 * 순서와 규칙만 알고있고 어떻게 동작하는구나로만 판단해야 나중에 더 깊게 수업하다보면 알 수 있을 것 같다.
 * 대충 느낌만 오는 정도이다.
 * 
 */
public class InputEx02_연습1 {

	public static void main(String[] args) {
	
		// 문제1) 숫자 2개를 입력받아서 합 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 입력받을 숫자를 입력하여 주세요 :");
		int firstNum = scan.nextInt();
		
		System.out.println("두번째 입력받을 숫자를 입력하여 주세요 :");
		int secondNum = scan.nextInt();
		
		System.out.println(firstNum + secondNum);
		
		// 문제2) 숫자 1개를 입력받아서 홀수이면 true 출력
		System.out.println("홀수 판정기 입니다. 무작위 정수형 숫자를 입력하여주세요.");
		int numOdd = scan.nextInt();
		
		System.out.println((numOdd % 2) == 1 ? "홀수" : "짝수");
		
		// 문제3) 성적을 입력받아 60점 이상이고 100점 이하이면 true 출력
		System.out.println("당신의 테트 점수를 입력하여 주세요 60 점만 넘으면 당신은 살았습니다.:");
		int testScore = scan.nextInt();
		System.out.println(testScore >= 60 ? "살았다." : "다시 수업들어야되?");
			
	}
	
}
