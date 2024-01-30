package step1_05.condition;
/*
 * 1월 19일 5:20 ~~ 5:36
 * 다시 풀어보았는데 어려웠다.
 * 각 상관관계를 안따져보고 작성했었다.
 * 
 */


import java.util.Scanner;
import java.util.Random;
/*
 * # 가위바위보 게임
 * 
 *   if - else if , else 등 구문을 활용하여 자율적으로 작성해보자.
 *   
 *   0 : 가위 , 1 : 바위 , 2 : 보
 */

public class IfEx18_연습2 {

	public static void main(String[] args) {
		
		int com = 0;	// 랜덤으로 저장
		int me = 0;		// 키보드로 입력받아 저장
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("가위바위보 게임 : 가위(0) 바위(1) 보(2)");
		
		System.out.println("무엇을 낼지지정해주세요 :");
		me = scan.nextInt();
		
		com = ran.nextInt(3);
		
		if (com == me) {
			System.out.println("com은" + com + "입니다.");
			System.out.println("비겼습니다.");
		}
		else if (com == 0 && me == 2) {
			System.out.println("com은" + com + "입니다.");
			System.out.println("졌습니다.");
		}
		else if (com == 1 && me == 0) {
			System.out.println("com은" + com + "입니다.");
			System.out.println("졌습니다.");
		}
		else if (com == 2  && me == 1) {
			System.out.println("com은" + com + "입니다.");
			System.out.println("졌습니다.");
		}
		else {
			System.out.println("com은" + com + "입니다.");
			System.out.println("이겼습니다.");
		}
		
	}


}
