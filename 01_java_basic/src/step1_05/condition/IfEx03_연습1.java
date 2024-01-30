package step1_05.condition;

import java.util.Scanner;

/*
 * 
 * 이전문제를 접하면서 작성하는 코드가 그나마 빨라졌다. 
 * 시간이 지나고 다시 풀어보는게 좋을 것 같다.
 */

/*
 * # 가위(0)바위(1)보(2) 게임[1단계]
 * 
 * 1. com은 바위(1)만 낼 수 있다.
 * 2. me는 0~2 사이의 숫자를 입력받는다.
 * 3. com과 me를 비교해,
 * 		1) 비겼다.
 * 		2) 내가 이겼다.
 * 		3) 내가 졌다.			를 출력한다.
 */


public class IfEx03_연습1 {

	public static void main(String[] args) {
		
		int com = 1;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("가위 바위 보! 게임입니다. 가위(0) 바위(1) 보(2)");
		int userChoice = scan.nextInt();
		
		if (com == userChoice) System.out.println("비겼습니다.");
		
		if (com > userChoice) System.out.println("졌습니다.");
		
		if (com < userChoice) System.out.println("이겼습니다.");
	}

}
