package step1_05.condition;

import java.util.Scanner;

/*/
 * 
 * 아직 scan의 import과정에서 뒤에서 찾아보고 미숙한 형태이다.
 * 문제작성의 방법은 좀 쉽게 알 수 있는 정도이다.
 */



/*
 * # Up & Down 게임[1단계]
 * 
 * 1. com은 8이다.
 * 2. me는 com의 숫자를 맞추는 게임이다.
 * 3. Scanner로 숫자를 입력받아 me 변수에 저장한다음 아래와 같은 기능을 구현한다.
 * 1) me가 com보다 작으면  Up! 출력 
 * 2) me와 com이 같으면 Bingo! 출력
 * 3) me가 com보다 크면 Down! 출력
 */


public class IfEx02_연습_1 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int com = 8;
		
		System.out.println("up & down 게임입니다. 숫자를 입력해주세요 :");
		int me = scan.nextInt();
		
		if(com == me) System.out.println("정답입니다.");
		
		if(com > me) System.out.println("up!!");
		
		if(com < me) System.out.println("down!!");
		
		scan.close();
	}

}
