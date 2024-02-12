package step1_05.condition;
/*
 * 2월 12일
 * 간단
 */
import java.util.Scanner;


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


public class IfEx03_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int com = 1;
		System.out.println("\n[0]가위\n[1]바위\n[2]보");
		System.out.print("입력 : ");
		int myChoice = scan.nextInt();
		
		if (myChoice == 0) System.out.println("패배");
		else if (myChoice == 1) System.out.println("무승부");
		else if (myChoice == 2) System.out.println("승리");
		
		scan.close();
	}

}
