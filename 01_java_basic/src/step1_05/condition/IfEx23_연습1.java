package step1_05.condition;
/*
 * 1월 22일 
 * 문제를 제대로 파악해야하는데 제대로 파악하지않고 풀어서
 * 정답을 보고 문제를 이해했다....
 * 그것뿐만이 아니라 막상 문제를 이해했어도 풀어냈을지는 모르겠다.
 */
import java.util.Random;
import java.util.Scanner;

/*
 * # 연산자 기호 맞추기 게임
 * 
 * 1) 1~10 사이의 랜덤 숫자 2개를 저장한다.
 * 2) 1~4 사이의 랜덤 숫자 1개를 저장한다.
 * 3) 위 숫자는 연산자 기호에 해당된다.
 * 	  1) 덧셈	  2)  뺄셈     3) 곱셈	 4) 나머지
 * 4) 사용자는 연산자 기호를 맞추는 게임이다.
 * 예) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    정답 : 2번
 */

public class IfEx23_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int diceNum1 = ran.nextInt(10) + 1;
		
		int diceNum2 = ran.nextInt(10) + 1;
		
		int answer = ran.nextInt(4) + 1;
		
		int numOperation = 0;
		
		if 		(answer == 1) numOperation = diceNum1 + diceNum2;
		else if (answer == 2) numOperation = diceNum1 - diceNum2;
		else if (answer == 3) numOperation = diceNum1 * diceNum2;
		else if (answer == 4) numOperation = diceNum1 % diceNum2;
		
		System.out.println(diceNum1 + "?" + diceNum2 + "=" + numOperation);
		System.out.println("1) + 2) - 3) * 4) %");
		
		System.out.print("보기에 주어진 넘버중 하나를 입력하세요 : ");
		int myAnswer = scan.nextInt();
		
		if (answer == myAnswer) {
			System.out.println("정답!");
		}
		else if(answer != myAnswer) {
			System.out.println("땡!");
		}
		scan.close();
		}
	}
